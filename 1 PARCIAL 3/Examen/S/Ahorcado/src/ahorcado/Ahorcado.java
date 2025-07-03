package ahorcado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ahorcado extends JFrame {
    private static final List<String> palabras = List.of(
            "java", "programacion", "computadora", "internet", "desarrollo",
            "tecnologia", "software", "hardware", "pantalla", "teclado",
            "raton", "impresora", "red", "base", "datos",
            "servidor", "cliente", "codigo", "sistema", "aplicacion"
    );

    private String palabraSecreta;
    private char[] palabraOculta;
    private int intentosRestantes;
    private List<Character> letrasIncorrectas;

    private JLabel palabraLabel;
    private JLabel letrasIncorrectasLabel;
    private JLabel intentosRestantesLabel;
    private JPanel ahorcadoPanel;

    public Ahorcado() {
        setTitle("Juego del Ahorcado");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
        iniciarJuego();

        setVisible(true);
    }

    private void initUI() {
        setLayout(new BorderLayout());

        // Panel superior con la palabra oculta y las letras incorrectas
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 1));

        palabraLabel = new JLabel();
        letrasIncorrectasLabel = new JLabel();
        intentosRestantesLabel = new JLabel();

        infoPanel.add(palabraLabel);
        infoPanel.add(letrasIncorrectasLabel);
        infoPanel.add(intentosRestantesLabel);

        add(infoPanel, BorderLayout.NORTH);

        // Panel central con el dibujo del ahorcado
        ahorcadoPanel = new AhorcadoPanel();
        add(ahorcadoPanel, BorderLayout.CENTER);

        // Panel inferior con el campo de texto para ingresar letras y el botón de reiniciar
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JTextField letraInput = new JTextField(5);
        JButton intentarButton = new JButton("Intentar");
        JButton reiniciarButton = new JButton("Reiniciar");

        inputPanel.add(new JLabel("Ingresa una letra:"));
        inputPanel.add(letraInput);
        inputPanel.add(intentarButton);
        inputPanel.add(reiniciarButton);

        add(inputPanel, BorderLayout.SOUTH);

        intentarButton.addActionListener(e -> {
            String texto = letraInput.getText();
            if (!texto.isEmpty()) {
                char letra = texto.charAt(0);
                intentarLetra(letra);
                letraInput.setText("");
            }
        });

        reiniciarButton.addActionListener(e -> iniciarJuego());
    }

    private void iniciarJuego() {
        palabraSecreta = palabras.get(new Random().nextInt(palabras.size()));
        palabraOculta = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }
        intentosRestantes = 6;
        letrasIncorrectas = new ArrayList<>();

        actualizarUI();
    }

    private void intentarLetra(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraOculta[i] = letra;
                acierto = true;
            }
        }

        if (!acierto) {
            letrasIncorrectas.add(letra);
            intentosRestantes--;
        }

        actualizarUI();
        verificarEstadoJuego();
    }

    private void actualizarUI() {
        palabraLabel.setText("Palabra: " + new String(palabraOculta));
        letrasIncorrectasLabel.setText("Letras incorrectas: " + letrasIncorrectas.toString());
        intentosRestantesLabel.setText("Intentos restantes: " + intentosRestantes);
        ahorcadoPanel.repaint();
    }

    private void verificarEstadoJuego() {
        if (intentosRestantes == 0) {
            JOptionPane.showMessageDialog(this, "Has perdido. La palabra era: " + palabraSecreta);
            iniciarJuego();
        } else if (new String(palabraOculta).equals(palabraSecreta)) {
            JOptionPane.showMessageDialog(this, "¡Has ganado!");
            iniciarJuego();
        }
    }

    private class AhorcadoPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int width = getWidth();
            int height = getHeight();

            // Dibujar la base del ahorcado
            g.drawLine(width / 4, height / 4, width / 4, height * 3 / 4);
            g.drawLine(width / 4, height / 4, width / 2, height / 4);
            g.drawLine(width / 2, height / 4, width / 2, height / 3);

            // Dibujar partes del cuerpo según los intentos restantes
            if (intentosRestantes <= 5) { // Cabeza
                g.drawOval(width / 2 - 10, height / 3, 20, 20);
            }
            if (intentosRestantes <= 4) { // Cuerpo
                g.drawLine(width / 2, height / 3 + 20, width / 2, height / 2);
            }
            if (intentosRestantes <= 3) { // Brazo izquierdo
                g.drawLine(width / 2, height / 3 + 30, width / 2 - 15, height / 3 + 45);
            }
            if (intentosRestantes <= 2) { // Brazo derecho
                g.drawLine(width / 2, height / 3 + 30, width / 2 + 15, height / 3 + 45);
            }
            if (intentosRestantes <= 1) { // Pierna izquierda
                g.drawLine(width / 2, height / 2, width / 2 - 15, height / 2 + 20);
            }
            if (intentosRestantes == 0) { // Pierna derecha
                g.drawLine(width / 2, height / 2, width / 2 + 15, height / 2 + 20);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ahorcado::new);
    }
}
