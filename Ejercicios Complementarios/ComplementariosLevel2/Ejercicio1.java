import java.util.ArrayList;
import java.util.Scanner;

/*1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
luego imprimir por pantalla el ranking*/

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<String>();
        
        Scanner teclado = new Scanner(System.in);
        
        int cuenta = 0;

        System.out.println("Si deseas agregar una ciudad a la lista, escribe su nombre");
        
        System.out.println("Para finalizar la ejecucion, escribe \"fin\"");

        String ciudad = teclado.nextLine();

        while (!ciudad.equals("fin")) {

            ciudades.add(ciudad);
            
            System.out.println("Para agregar otra ciudad al listado, escribi el nombre");
            
            System.out.println("Para finalizar, escribe \"fin\"");
            
            ciudad = teclado.nextLine();
        }
        teclado.close();
        
        for (String i : ciudades){
            
            cuenta +=1;
            
            System.out.println("#" + cuenta +" "+ i);
        }
    }
}