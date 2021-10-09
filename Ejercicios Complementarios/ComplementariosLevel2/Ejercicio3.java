import java.util.ArrayList;
import java.util.Collections;

/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<String> baraja = new ArrayList<>();
        
        ArrayList<String> palo = new ArrayList<>();
                 
        String carta = "";

        palo.add("de tréboles");
        
        palo.add("de diamantes");
        
        palo.add("de corazones");
        
        palo.add("de picas");

        for (String s : palo) {
            
            for (int i = 1; i < 14; i++){
                
                carta = i + " " + s;
                
                baraja.add(carta);
            }
        }
        System.out.println("Lista de cartas");
        
        System.out.println(baraja);

        System.out.println("Lista de cartas en orden invertido");
        
        Collections.reverse(baraja);
        
        System.out.println(baraja);

        System.out.println("Lista de cartas desordenadas");
        
        Collections.shuffle(baraja);
        
        System.out.println(baraja);

    }
}