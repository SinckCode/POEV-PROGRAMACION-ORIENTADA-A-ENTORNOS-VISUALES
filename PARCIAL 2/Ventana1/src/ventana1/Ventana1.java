import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana1 extends JFrame {
    private JTextField display;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonIgual, botonLimpiar;

    public Ventana1() {
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        display = new JTextField();
        display.setEditable(false);
        gbc.gridx = 0;
        gbc.gridwidth = 4;
        gbc.gridy = 0;
        panelPrincipal.add(display, gbc);

        boton1 = new JButton("1");
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        panelPrincipal.add(boton1, gbc);

        boton2 = new JButton("2");
        gbc.gridx = 1;
        panelPrincipal.add(boton2, gbc);

        boton3 = new JButton("3");
        gbc.gridx = 2;
        panelPrincipal.add(boton3, gbc);
        
        botonLimpiar = new JButton("C");
        gbc.gridx = 3;
        panelPrincipal.add(botonLimpiar, gbc);

        boton4 = new JButton("4");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelPrincipal.add(boton4, gbc);

        boton5 = new JButton("5");
        gbc.gridx = 1;
        panelPrincipal.add(boton5, gbc);

        boton6 = new JButton("6");
        gbc.gridx = 2;
        panelPrincipal.add(boton6, gbc);
        
        botonDivision = new JButton("/");
        gbc.gridx = 3;
        panelPrincipal.add(botonDivision, gbc);

        boton7 = new JButton("7");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelPrincipal.add(boton7, gbc);

        boton8 = new JButton("8");
        gbc.gridx = 1;
        panelPrincipal.add(boton8, gbc);

        boton9 = new JButton("9");
        gbc.gridx = 2;
        panelPrincipal.add(boton9, gbc);
        
        botonMultiplicacion = new JButton("*");
        gbc.gridx = 3;
        panelPrincipal.add(botonMultiplicacion, gbc);

        boton0 = new JButton("0");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panelPrincipal.add(boton0, gbc);

        botonResta = new JButton("-");
        gbc.gridx = 3;
        panelPrincipal.add(botonResta, gbc);

        botonIgual = new JButton("=");
        gbc.gridx = 1;
        panelPrincipal.add(botonIgual, gbc);

        botonSuma = new JButton("+");
        gbc.gridx = 2;
        panelPrincipal.add(botonSuma, gbc);

        add(panelPrincipal);
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ventana1();
            }
        });
    }
}
