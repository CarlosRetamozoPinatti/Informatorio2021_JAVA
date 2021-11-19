package ComplementariosLevel1;

import java.util.Scanner;

/*2.	Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, 
multiplicación, división y módulo (resto de la división) de ambos números”*/

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int n1, n2, suma, resta, multiplicacion, división, modulo;

        try{

        System.out.println("Ingrese el número 1: ");
        n1 = teclado.nextInt();

        System.out.println("Ingrese el número 2: ");
        n2 = teclado.nextInt();

        suma = n1 + n2;

        resta = n1 - n2;

        multiplicacion = n1 * n2;

        división = n1 / n2;

        modulo = n1 % n2;

        } finally { teclado.close(); }

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + división);
        System.out.println("El módulo es: " + modulo);
    }
    
}
