import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppColores extends JFrame {

    private JTextField textoNombre;
    private JButton btn_pulsame;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7;
    private JRadioButton jRadioButton1, jRadioButton2, jRadioButton3;
    private JTextField jTextField2, jTextField3;
    private JComboBox<String> jComboBox1;

    public AppColores() {
        initComponents();
    }

    private void initComponents() {
        // Crear componentes
        jLabel1 = new JLabel("Escribe tu nombre:");
        textoNombre = new JTextField();
        btn_pulsame = new JButton("Enviar");
        jLabel2 = new JLabel("Selecciona un color");
        jRadioButton1 = new JRadioButton("Rojo");
        jRadioButton2 = new JRadioButton("Amarillo");
        jRadioButton3 = new JRadioButton("Azul");
        jLabel3 = new JLabel("Solo recibe números:");
        jLabel4 = new JLabel("Usted seleccionó:");
        jLabel5 = new JLabel("Recibe todo menos números");
        jLabel6 = new JLabel("Elige un trámite:");
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jComboBox1 = new JComboBox<>(new String[]{"CURP", "Item 2", "Item 3", "Item 4"});
        jLabel7 = new JLabel("Seleccionaste:");

        // Configuración del JFrame
        setTitle("AppColores");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Obtener el contentPane del JFrame
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(null); // Usar un layout nulo para posicionar componentes manualmente

        // Añadir componentes al contentPane
        jLabel1.setBounds(25, 24, 120, 25);
        contentPane.add(jLabel1);

        textoNombre.setBounds(150, 24, 150, 25);
        contentPane.add(textoNombre);

        btn_pulsame.setBounds(320, 24, 80, 25);
        contentPane.add(btn_pulsame);

        jLabel2.setBounds(25, 70, 150, 25);
        contentPane.add(jLabel2);

        // Agregar radio buttons a un ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        jRadioButton1.setBounds(25, 100, 100, 25);
        buttonGroup.add(jRadioButton1);
        contentPane.add(jRadioButton1);

        jRadioButton2.setBounds(130, 100, 100, 25);
        buttonGroup.add(jRadioButton2);
        contentPane.add(jRadioButton2);

        jRadioButton3.setBounds(240, 100, 100, 25);
        buttonGroup.add(jRadioButton3);
        contentPane.add(jRadioButton3);

        jLabel4.setBounds(350, 100, 200, 25);
        contentPane.add(jLabel4);

        jLabel3.setBounds(25, 140, 150, 25);
        contentPane.add(jLabel3);

        jTextField2.setBounds(180, 140, 150, 25);
        contentPane.add(jTextField2);

        jLabel5.setBounds(25, 180, 200, 25);
        contentPane.add(jLabel5);

        jTextField3.setBounds(230, 180, 150, 25);
        contentPane.add(jTextField3);

        jLabel6.setBounds(25, 220, 150, 25);
        contentPane.add(jLabel6);

        jComboBox1.setBounds(180, 220, 150, 25);
        contentPane.add(jComboBox1);

        jLabel7.setBounds(350, 220, 150, 25);
        contentPane.add(jLabel7);

        // Agregar ActionListener al botón
        btn_pulsame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textoNombre.getText();
                JOptionPane.showMessageDialog(contentPane, "Hola! " + text);
            }
        });

        jRadioButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabel4.setText("Seleccionaste: " + jRadioButton1.getText());
                jRadioButton1.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jLabel4.setText("Usted seleccionó: " + jRadioButton1.getText());
                jRadioButton1.setBackground(null);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jLabel4.setText("Mouse Presionado: " + jRadioButton1.getText());
            }
        });

        jRadioButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabel4.setText("Seleccionaste: " + jRadioButton2.getText());
                jRadioButton2.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jLabel4.setText("Usted seleccionó: " + jRadioButton2.getText());
                jRadioButton2.setBackground(null);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jLabel4.setText("Mouse Presionado: " + jRadioButton2.getText());
            }
        });

        jRadioButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabel4.setText("Seleccionaste: " + jRadioButton3.getText());
                jRadioButton3.setBackground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jLabel4.setText("Usted seleccionó: " + jRadioButton3.getText());
                jRadioButton3.setBackground(null);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jLabel4.setText("Mouse Presionado: " + jRadioButton3.getText());
            }
        });

        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) jComboBox1.getSelectedItem();
                jLabel7.setText("Seleccionaste: " + jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
            }
        });

        jTextField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (Character.isDigit(e.getKeyChar())) {
                    e.consume();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
 
            }
 
            @Override
            public void keyPressed(KeyEvent e) {
 
            }
        });

        jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume();
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
 
            }
 
            @Override
            public void keyPressed(KeyEvent e) {
 
            }
        });
    }

    public static void main(String[] args) {
        // Asegura que la creación de la interfaz gráfica se haga en el hilo de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AppColores frame = new AppColores();
                frame.setVisible(true);
            }
        });
    }
}
