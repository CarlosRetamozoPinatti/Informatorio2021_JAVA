package ComplementariosLevel1;

import java.util.Scanner;

/*4.	Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
*/

public class Ejercicio4 {
        public static void main(String[] args) {
    
            Scanner teclado = new Scanner(System.in);
            
            try {

            System.out.println("Ingresa un numero para hacer el factorial");
            
            int numero = teclado.nextInt();
    
            int factorial = 1;
    
            for (int i = 1; i<= numero; i++) {
                
                factorial = i * factorial;
                
                if (i == numero) {
                    
                    System.out.println(" El factorial de " + numero + " es: "+ factorial);
                }
            }
        } finally { teclado.close();}
    }
}

