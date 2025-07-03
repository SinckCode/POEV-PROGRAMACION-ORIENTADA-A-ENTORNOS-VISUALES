import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ventana extends JFrame{
    public Ventana(){
        JFrame frame = new JFrame("Juego de pares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        JTextArea display = new JTextArea();
        display.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        panelPrincipal.add(display, gbc);

        ImageIcon img = new ImageIcon("C:\\Users\\sayog\\Pictures\\Assets\\Dinos\\Dino1.png");
        JButton boton[][] = new JButton(img)[4];
        
        JButton boton01 = new JButton("1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton01, gbc);

        JButton boton02 = new JButton("2");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton02, gbc);

        JButton boton03 = new JButton("3");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton03, gbc);

        JButton boton04 = new JButton("4");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton04, gbc);

        JButton boton05 = new JButton("5");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton05, gbc);

        JButton boton06 = new JButton("6");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton06, gbc);

        JButton boton07 = new JButton("7");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton07, gbc);

        JButton boton08 = new JButton("8");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton08, gbc);

        JButton boton09 = new JButton("9");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton09, gbc);

        JButton boton10 = new JButton("10");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton10, gbc);
        
        JButton boton11 = new JButton("11");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton11, gbc);

        JButton boton12 = new JButton("12");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton12, gbc);

        JButton boton13 = new JButton("13");
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton13, gbc);

        JButton boton14 = new JButton("14");
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton14, gbc);

        JButton boton15 = new JButton("15");
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton15, gbc);
        
        JButton boton16 = new JButton("16");
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panelPrincipal.add(boton16, gbc);

        frame.getContentPane().add(panelPrincipal);
    }

    public static void main(String[] args) {
        Ventana juego = new Ventana();
    }
}