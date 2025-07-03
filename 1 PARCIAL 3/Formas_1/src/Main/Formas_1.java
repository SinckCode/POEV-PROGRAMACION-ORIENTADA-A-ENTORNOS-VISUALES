package Main;
import java.awt.Color;

import java.awt.Graphics;
 
import javax.swing.JPanel;

 
public class Formas_1 extends JPanel {
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        g.drawRect(50, 50, 50, 50);  
        g.drawOval(150, 50, 50, 50);
        int [] x={250, 300, 330, 220};
        int [] y={50, 50, 100, 100};
        g.drawPolygon(x, y, 4);
       
        g.setColor(Color.blue);
        g.fillRect(50, 120, 50, 50);
 
        g.setColor(Color.green);
        g.fillOval(150, 120, 50, 50);
        
        int [] f={260, 310, 340, 220};
        int [] w={120, 120, 170, 170};
        g.setColor(Color.red);
        g.fillPolygon(f, w, 4);
        
        int[] d = {530, 550, 580, 580, 600, 580, 580,550, 530, 500, 480, 480, 460, 480, 480, 500};
        int[] r = {320, 300, 300, 270, 260, 240, 220,220, 200, 220, 220, 240, 260, 270, 300, 300};
        
        g.setColor(Color.red);
        g.fillPolygon(d, r, 16);
        
        
        int[] j = {700, 650, 750};
        int[] k = {300, 230, 230};
        
        g.setColor(Color.red);
        g.fillPolygon(j, k, 3);
        
        
       
 
    }
 
}