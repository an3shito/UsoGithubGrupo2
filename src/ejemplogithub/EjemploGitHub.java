
package ejemplogithub;

// Ejemplo de Github Grupo 2 Java

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjemploGitHub {

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Hola Mundo");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese algun nombre:");
        System.out.println("Hola Mundo");
        
        String entrada = in.nextLine();
        
        System.out.println("el nombre es:"+nombre);
        
    }
    
}
