package ComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3
cursos (3 arrayList) e imprimir dichos cursos.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> estudiantes = new ArrayList<String>();
        
        String estudiante = "";
        
        int i = 1;

        while   (i< 13) {
            
            System.out.println("Ingrese al Estudiante #" + i + ": ");
            
            estudiante = teclado.nextLine();
            
            estudiantes.add(estudiante);
            
            i++;
        }
        teclado.close();

        Collections.reverse(estudiantes);

        List<String> curso1 = estudiantes.subList(0, 4);
        
        List<String> curso2 = estudiantes.subList(4, 8);
        
        List<String> curso3 = estudiantes.subList(8, 12);

        System.out.println("Los alumnos del curso #1 son: " + curso1);
        
        System.out.println("Los alumnos del curso #2 son: " + curso2);
        
        System.out.println("Los alumnos del curso #3 son: " + curso3);
    }
}