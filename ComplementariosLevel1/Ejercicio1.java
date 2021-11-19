package ComplementariosLevel1;

import java.util.Scanner;

/*1.	Solicitar por consola el nombre del usuario e imprimir por pantalla el
siguiente mensaje “HOLA {USUARIO}!!!”*/

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nombre, apellido;

        try {

        System.out.println(" Ingrese su nombre ");

        nombre = teclado.nextLine();

        System.out.println(" Ingrese su apellido ");

        apellido = teclado.nextLine();
        
        } finally {

            teclado.close();

        }

        System.out.println(" Hola! " + nombre + " " + apellido + "!!!");
    }
}