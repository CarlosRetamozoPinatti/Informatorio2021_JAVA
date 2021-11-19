package ComplementariosLevel1;

import java.util.Scanner;

/*3.	Confeccionar un programa que dado un número entero como dato de entrada imprima la
secuencia de números (incrementos de 1) de la siguiente forma:*/

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

        System.out.println("Ingresa un numero");
        
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            
            System.out.println();
            
            for (int x = 1; x <= i; x++) {
                
                System.out.print(x);
            }
        }
    } finally { teclado.close();}
}
}

