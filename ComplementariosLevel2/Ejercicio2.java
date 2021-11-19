package ComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

/*2.	Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al
principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el
tamaño de la misma (antes y después de agregar a en la primera y última posición).*/

public class Ejercicio2 {
    public static void main(String[] args) {
        
        ArrayList<String> numeros = new ArrayList<String>();
        
        Scanner teclado = new Scanner(System.in);
        
        int i = 1;

        while (i <= 5) {
            
            System.out.println("Ingresa un numero para la posición " + i + ":");
            
            String numero = teclado.nextLine();
            
            numeros.add(numero);
            
            i++;
        }

        System.out.println("Ingresa el numero que irá al principio de la lista");
        
        String numero = teclado.nextLine();
        
        numeros.add(0, numero);

        
        System.out.println("Ingresa el numero que ira al final de la lista");
        
        numero = teclado.nextLine();
        
        numeros.add(numeros.size(), numero);
        
        teclado.close();

        System.out.println("\n Los primeros "+ (numeros.size()-2) +"elementos agregados son: ");
        
        for (int n = 1; n < numeros.size()-1; n++) {
            
            System.out.print(numeros.get(n) + " - ");
        }

        System.out.println("\nLa lista completa con " + numeros.size() +" elementos es: ");
        
        for (String n : numeros){
            
            System.out.print(n + " - ");
        }
    }
}