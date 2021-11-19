package ComplementariosLevel1;

import java.util.Scanner;

/*7.	Realizar un Programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().*/

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

        System.out.println("Ingresa la palabra o frase en minuscula");
        
        String frase = teclado.nextLine();

        char letras[] = frase.toCharArray();

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] >= 'a' && letras[i] <= 'z' ) { 
                //solo voy a tener en cuenta letras
                System.out.print((char) (letras[i]-32));
            } 
            else {

                System.out.print((char) (letras[i]));
            }
        }
    } finally { teclado.close(); }
}
}
    

