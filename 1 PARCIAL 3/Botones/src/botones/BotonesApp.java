package botones;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BotonesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear el JFrame
                JFrame frame = new JFrame("Dibujo de Figuras");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Crear una instancia de la clase Botones
                Botones botonesPanel = new Botones();
                
                // Agregar el panel de Botones al contenido del frame
                frame.getContentPane().add(botonesPanel);
                
                // Configurar el tamaño del frame
                frame.setSize(600, 300);
                
                // Hacer visible el frame
                frame.setVisible(true);
            }
        });
    }
}

