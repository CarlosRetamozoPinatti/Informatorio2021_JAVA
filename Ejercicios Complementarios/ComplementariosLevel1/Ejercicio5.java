package ComplementariosLevel1;

import java.util.Scanner;

/* 5.	Se desea una aplicación que solicite 2 números enteros y realice la operación de
multiplicación por sumas sucesivas (sin uso de librerías).*/

public class Ejercicio5 {
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            
            int suma = 0;
            
            try{

            System.out.println("Ingresa el primer valor");
            
            int num1 = teclado.nextInt();
            
            System.out.println("Ingresa el segundo valor");
            
            int num2 = teclado.nextInt();
    
            
            for (int i = 1; i <= num1; i++) {
                
                suma += num2;
                
                if (i == num1) {
                    System.out.println("El resultado de " + num1 + " x " + num2 + " = "+ suma);
                }
            }
    
        } finally { teclado.close(); }
    }
}
    

