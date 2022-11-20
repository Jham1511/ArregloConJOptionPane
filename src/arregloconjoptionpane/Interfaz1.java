package arregloconjoptionpane;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;


public class Interfaz1 extends JPanel{

  public Interfaz1 (){
      setBackground(Color.WHITE);
  }
    public void paint (Graphics g){
        Random random = new Random ();
        super.paint(g);
        int r = random.nextInt(255),
            f = random.nextInt(255),
            b = random.nextInt(255);
        Color colorAleatorio = new Color(r, f, b); 

        g.drawOval(100, 50, 500, 500); //Imprime el circulo de fondo
        //
        g.setColor(colorAleatorio); //El fondo del circulo cambiara dependiendo de colorAleatorio
        //
        g.fillOval(100, 50, 500, 500);
        //
        g.setColor(Color.white);
        //
        g.drawRect(100, 350, 500, 50);
        //
        g.fillRect(100, 350, 500, 50);
        //
        g.setColor(Color.white);
        //
        g.drawRect(200,55, 100, 490);
        //
        g.fillRect(200, 55, 100, 490);
    } 





    public static void main (String[]args){
        JFrame ventana = new JFrame ("Bola de Smash");
        Interfaz1 objeto = new Interfaz1 ();
        ventana.add(objeto);
        ventana.setSize(700,700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
