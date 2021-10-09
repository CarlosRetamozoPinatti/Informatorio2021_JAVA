package ComplementariosLevel1;

import java.util.Scanner;

/*8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

public class Ejercicio8 {
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            
            try {
            
                System.out.println("¿En que ciudad vivis?");
            
                String ciudad = teclado.nextLine();
            
                System.out.println("¿Como es tu direccion?");
            
                String direccion = teclado.nextLine();
            
                System.out.println("¿Que edad tenes?");
            
                String edad = teclado.nextLine();
            
                System.out.println("¿Como es tu nombre completo?");
            
                String nombreCompleto = teclado.nextLine();
    
            System.out.println(ciudad +" - "+ direccion +" - "+ edad +" - "+ nombreCompleto);
            
        } finally { teclado.close();}
    }
}
    

