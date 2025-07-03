package ahorcados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Dibujos extends JPanel {
    private static final String[] PALABRAS = {
            "java", "programacion", "computadora", "internet", "desarrollo",
            "tecnologia", "software", "hardware", "pantalla", "teclado",
            "raton", "impresora", "red", "base", "datos",
            "servidor", "cliente", "codigo", "sistema", "aplicacion"
    };

    private String palabraSecreta;
    private char[] palabraOculta;
    private int intentosRestantes;
    private StringBuilder letrasIncorrectas;

    private JLabel palabraLabel;
    private JLabel letrasIncorrectasLabel;
    private JLabel intentosRestantesLabel;
    private AhorcadoPanel ahorcadoPanel; // Cambio de tipo de panel

    public Dibujos() {
        setLayout(new BorderLayout());

        // Panel superior con la palabra oculta y las letras incorrectas
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 1));

        palabraLabel = new JLabel();
        palabraLabel.setFont(new Font("Serif", Font.BOLD, 24));
        palabraLabel.setForeground(Color.BLACK);
        palabraLabel.setHorizontalAlignment(SwingConstants.CENTER);

        letrasIncorrectasLabel = new JLabel();
        letrasIncorrectasLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        letrasIncorrectasLabel.setForeground(Color.RED);
        letrasIncorrectasLabel.setHorizontalAlignment(SwingConstants.CENTER);

        intentosRestantesLabel = new JLabel();
        intentosRestantesLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        intentosRestantesLabel.setForeground(Color.BLUE);
        intentosRestantesLabel.setHorizontalAlignment(SwingConstants.CENTER);

        infoPanel.add(palabraLabel);
        infoPanel.add(letrasIncorrectasLabel);
        infoPanel.add(intentosRestantesLabel);

        add(infoPanel, BorderLayout.NORTH);

        // Panel central con el dibujo del ahorcado y la imagen de fondo
        ahorcadoPanel = new AhorcadoPanel(); // Cambio de tipo de panel
        ahorcadoPanel.setLayout(new BorderLayout());
        add(ahorcadoPanel, BorderLayout.CENTER);

        // Panel inferior con el campo de texto para ingresar letras y el botón de reiniciar
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JTextField letraInput = new JTextField(5);
        JButton intentarButton = new JButton("Intentar");
        JButton reiniciarButton = new JButton("Reiniciar");
        JButton salirBtn = new JButton("Salir");

        letraInput.setFont(new Font("Serif", Font.PLAIN, 18));

        intentarButton.setFont(new Font("Serif", Font.BOLD, 18));
        intentarButton.setBackground(new Color(34, 139, 34));
        intentarButton.setForeground(Color.WHITE);
        intentarButton.setFocusPainted(false);
        intentarButton.setBorderPainted(false);
        intentarButton.setOpaque(true);


        reiniciarButton.setFont(new Font("Serif", Font.BOLD, 18));
        reiniciarButton.setBackground(new Color(34, 76, 178));
        reiniciarButton.setForeground(Color.WHITE);
        reiniciarButton.setFocusPainted(false);
        reiniciarButton.setBorderPainted(false);
        reiniciarButton.setOpaque(true);

        inputPanel.add(new JLabel("Ingresa una letra:"));
        inputPanel.add(letraInput);
        inputPanel.add(intentarButton);
        inputPanel.add(reiniciarButton);
        
        // Botón de salir
        salirBtn.setFont(new Font("Serif", Font.BOLD, 18));
        salirBtn.setBackground(new Color(178, 34, 34));
        salirBtn.setForeground(Color.WHITE);
        salirBtn.setFocusPainted(false);
        salirBtn.setBorderPainted(false);
        salirBtn.setOpaque(true);
        salirBtn.addActionListener(e -> System.exit(0));
        inputPanel.add(salirBtn);

        add(inputPanel, BorderLayout.SOUTH);

        

        intentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = letraInput.getText();
                if (!texto.isEmpty()) {
                    char letra = texto.charAt(0);
                    intentarLetra(letra);
                    letraInput.setText("");
                }
            }
        });

        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarJuego();
            }
        });

        iniciarJuego();
    }

    private void iniciarJuego() {
        palabraSecreta = PALABRAS[new Random().nextInt(PALABRAS.length)];
        palabraOculta = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }
        intentosRestantes = 6;
        letrasIncorrectas = new StringBuilder();

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
            letrasIncorrectas.append(letra).append(" ");
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

        // Dibujar la imagen de fondo
        Image image = new ImageIcon("C:\\Universidad\\(POEV) PROGRAMACIÓN ORIENTADA A ENTORNOS VISUALES\\1 PARCIAL 3\\Examen\\A\\Ahorcados\\resourses\\background2.png").getImage();
        if (image != null) {
            g.drawImage(image, 0, 0, width, height, this);
        } else {
            System.out.println("Error: No se pudo cargar la imagen en el juego.");
        }

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
}