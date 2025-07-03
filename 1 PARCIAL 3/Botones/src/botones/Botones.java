package botones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Botones extends JPanel {

    private JLabel jLabelAltura;
    private JLabel jLabelAnchura;
    private JTextField valorAltura;
    private JTextField valorAnchura;
    private JButton btnEnviar;

    private String Dibujar_figura = "";
    private int x = -1, y = -1; // Coordenadas del clic del ratón
    private int width = 100, height = 50; // Valores predeterminados de ancho y alto

    public Botones() {
        JButton Btn_Rectangulo = new JButton("Dibujar Rectángulo");
        JButton Btn_Circulo = new JButton("Dibujar Círculo");
        JButton Btn_Trianglo = new JButton("Dibujar Triangulo");
        jLabelAltura = new JLabel("Escribe la Altura:");
        valorAltura = new JTextField(5);
        jLabelAnchura = new JLabel("Escribe la Anchura:");
        valorAnchura = new JTextField(5);
        btnEnviar = new JButton("Enviar");

        Btn_Rectangulo.addActionListener((ActionEvent e) -> {
            Dibujar_figura = "rectangulo";
        });

        Btn_Circulo.addActionListener((ActionEvent e) -> {
            Dibujar_figura = "circulo";
        });

        Btn_Trianglo.addActionListener((ActionEvent e) -> {
            Dibujar_figura = "triangulo";
        });

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    height = Integer.parseInt(valorAltura.getText());
                    width = Integer.parseInt(valorAnchura.getText());
                } catch (NumberFormatException ex) {
                    // Manejo de error: valores no válidos
                    height = 50;
                    width = 100;
                }
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(jLabelAltura);
        inputPanel.add(valorAltura);
        inputPanel.add(jLabelAnchura);
        inputPanel.add(valorAnchura);
        inputPanel.add(btnEnviar);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(Btn_Rectangulo);
        buttonPanel.add(Btn_Circulo);
        buttonPanel.add(Btn_Trianglo);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.SOUTH);
        add(inputPanel, BorderLayout.NORTH);

        // Añadir el MouseListener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                height = Integer.parseInt(valorAltura.getText());
                width = Integer.parseInt(valorAnchura.getText());

                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (x != -1 && y != -1) {
            switch (Dibujar_figura) {
                case "rectangulo":
                    g2d.setColor(Color.BLUE);
                    g2d.fillRect(x, y, width, height);
                    break;

                case "circulo":
                    g2d.setColor(Color.RED);
                    g2d.fillOval(x, y, width, height);
                    break;

                case "triangulo":
                    g2d.setColor(Color.GREEN);
                    // Definir los puntos del triángulo
                    int[] xPoints = {x, x - width / 2, x + width / 2};
                    int[] yPoints = {y, y + height, y + height};
                    int nPoints = 3;
                    g2d.fillPolygon(xPoints, yPoints, nPoints);
                    break;

                default:
                    break;
            }
        }
    }

}
