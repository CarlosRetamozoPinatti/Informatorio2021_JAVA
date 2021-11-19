package ComplementariosLevel1;

import java.util.Scanner;

/* 6.	Se desea una aplicación que solicite 2 números enteros y
realice la operación de potencia (sin uso de librerías).*/

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        try {
        
            System.out.println("Ingresa el primer valor (base):");
        
            int base = teclado.nextInt();
        
            System.out.println("Ingresa el segundo valor (exponente):");
        
            int exponente = teclado.nextInt();

            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + result(base, exponente));
    } 
    
    finally {teclado.close();}
   
}

    public static int result(int base, int exponent) {
        
        int resultado = 1;

        for (int i = 1; i <= exponent; i++) {
            
            resultado *= base;
        
        } return resultado;
    
    }

}
