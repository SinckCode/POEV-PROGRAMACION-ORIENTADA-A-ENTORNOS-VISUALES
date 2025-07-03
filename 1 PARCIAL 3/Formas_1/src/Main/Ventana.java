package Main;

import javax.swing.JFrame;
 
public class Ventana extends JFrame {
    private Ventana() {
        setTitle("Ventana de formas");
        setSize(1080, 920);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Formas_1());
        //add(new Formas_2());
    }
 
    public static void main(String[] args) {
        Ventana c = new Ventana();
        c.setVisible(true);
    }
 
}
