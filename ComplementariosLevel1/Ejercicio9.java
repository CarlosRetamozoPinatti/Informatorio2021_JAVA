package ComplementariosLevel1;

import java.util.Scanner;

/*9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad
de veces que aparece una letra dada.*/

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        try {
        
        System.out.println("Escribi una frase: ");
        
        String frase = teclado.nextLine();

        System.out.println("Letra queres saber si se repite?");
        
        char letra = teclado.next().charAt(0);
        
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.charAt(i) == letra) {
                
                contador++;
            }
        }
        
        System.out.println(contador);
        
    } finally {teclado.close();}
}
}

