package arregloconjoptionpane;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ArregloConJoptionPane {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String input = "";
        while (!esNumero(input)) {
            input = JOptionPane.showInputDialog("Ingrese el tamano del arreglo");
        }

        int tam = Integer.parseInt(input), cont = 0, arr[] = new int[tam];
        while (cont < tam) {
            input = JOptionPane.showInputDialog("Ingrese el elemento " + cont + " del arreglo");

            if (esNumero(input)) {
                arr[cont] = Integer.parseInt(input);
                cont++;

            }
        }
        int cantPar = 0, cantImpar = 0;
        for (int i = 0; i < tam; i++) {
            if (arr[i] % 2 == 0) {
                cantPar++;
            } else {
                cantImpar++;
            }
        }
        if (cantPar > cantImpar) {
            // Mas pares
            JOptionPane.showMessageDialog(null, "Se encontraron mas pares en el arreglo"
                    + "\nSe imprimira una Smash Ball");
            JFrame ventana = new JFrame("Bola de Smash");
            Interfaz1 objeto = new Interfaz1();
            ventana.add(objeto);
            ventana.setSize(700, 700);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (cantPar < cantImpar) {
            // Mas impares
            JOptionPane.showMessageDialog(null, "Se encontraron mas impares en el arreglo"
                    + "\nSe imprimira el logo de Microsoft");
            JFrame ventana = new JFrame("Microsoft");
            Microsoft objeto = new Microsoft();
            ventana.add(objeto);
            ventana.setSize(700, 700);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            // Misma cantidad
            JOptionPane.showMessageDialog(null, "Se encontraron cantidades iguales de pares e impares en el arreglo"
                    + "\nSe imprimira un ----");
        }
    }//Fin del main

    public static boolean esNumero(String input) {
        boolean valido = true;
        if (!input.isEmpty() && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) < 48 || input.charAt(i) > 57) {
                    valido = false;
                }
            }
        } else {
            valido = false;
        }
        return valido;

    }

}//Fin de la clase
