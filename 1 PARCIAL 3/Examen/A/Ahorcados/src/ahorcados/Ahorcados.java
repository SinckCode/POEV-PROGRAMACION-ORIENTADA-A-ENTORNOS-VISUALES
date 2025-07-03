package ahorcados;

import javax.swing.*;
import java.awt.*;

public class Ahorcados {

    private static JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("Menú de Inicio");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600); // Tamaño ampliado
            frame.setLocationRelativeTo(null); // Centrar en la pantalla

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Image image = new ImageIcon("C:\\Universidad\\(POEV) PROGRAMACIÓN ORIENTADA A ENTORNOS VISUALES\\1 PARCIAL 3\\Examen\\A\\Ahorcados\\resourses\\background.png").getImage();
                    if (image != null) {
                        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                    } else {
                        System.out.println("Error: No se pudo cargar la imagen en el menú de inicio.");
                    }
                }
            };
            panel.setLayout(new BorderLayout());

            JLabel label = new JLabel("Bienvenido al Juego del Ahorcado");
            label.setFont(new Font("Serif", Font.BOLD, 24));
            label.setForeground(Color.WHITE);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(label, BorderLayout.CENTER);

            JButton startButton = new JButton("Comenzar");
            startButton.setFont(new Font("Serif", Font.BOLD, 18));
            startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            startButton.setBackground(new Color(34, 139, 34));
            startButton.setForeground(Color.WHITE);
            startButton.setFocusPainted(false);
            startButton.setBorderPainted(false);
            startButton.setOpaque(true);
            startButton.addActionListener(e -> {
                frame.dispose(); // Cerrar el menú de inicio
                iniciarJuego();
            });
            panel.add(startButton, BorderLayout.SOUTH);

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static void iniciarJuego() {
        JFrame gameFrame = new JFrame("Ahorcados");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(800, 600); // Tamaño ampliado
        gameFrame.setLocationRelativeTo(null); // Centrar en la pantalla

        JPanel panel = new JPanel();
            
        panel.setLayout(new BorderLayout());

        // Panel de dibujos
        Dibujos dibujosPanel = new Dibujos();
        panel.add(dibujosPanel, BorderLayout.CENTER);

        gameFrame.getContentPane().add(panel);

        gameFrame.setVisible(true);
    }
}
