package arregloconjoptionpane;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;

public class Microsoft extends JPanel {
    
public Microsoft (){
      setBackground(Color.WHITE);
  }
    public void paint (Graphics g){
        Random random = new Random ();
        super.paint(g);
        

        g.setColor(Color.red); //Imprime el cuadrado de la izquierda superior
        //
        g.drawRect(100, 50, 200, 200);
        //
        g.fillRect (100, 50, 200, 200);
        //
        g.setColor(Color.GREEN);//Imprime el cuadrado de la derecha superior
        //
        g.drawRect(350, 50, 200, 200);
        //
        g.fillRect (350, 50, 200, 200);
        //
        g.setColor(Color.cyan); //Imprime el cuadrado de la izquierda inferior
        //
        g.drawRect(100, 300, 200, 200);
        //
        g.fillRect(100, 300, 200, 200);
        //
        g.setColor(Color.ORANGE);//Imprime el cuadrado de la derecha inferior
        //
        g.drawRect(350, 300, 200, 200);
        //
        g.fillRect (350, 300, 200, 200);
        //
        g.setColor(Color.BLACK); //Imprime el texto abajo de los cuadrados
        g.setFont(new Font("Serif",PLAIN,64));
        g.drawString("M i c r o s o f t", 140, 600);
    } 
    
    public static void main (String[]args){
        JFrame ventana = new JFrame ("Microsoft");
        Microsoft objeto = new Microsoft ();
        ventana.add(objeto);
        ventana.setSize(700,700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}





