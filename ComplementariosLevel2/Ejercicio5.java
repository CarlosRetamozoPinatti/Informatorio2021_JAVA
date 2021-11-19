package ComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
el resumen de carga de horas semanal de un empleado. Se debe generar otra lista que
contenga los totales y luego imprimir el total final a cobrar.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        
        ArrayList<Integer> totalDia = new ArrayList<Integer>();
        
        int valor = 0;
        
        int sumaFinal = 0;
        
        int dias = 1;

        while (dias < 6){
            
            System.out.println("¿Cuantas horas se trabajó el dia #" + dias +"?");
            
            valor = teclado.nextInt();
            
            horasTrabajadas.add(valor);

            System.out.println("¿Cuanto vale cada hora trabajada el dia #" + dias +"?");
            
            valor = teclado.nextInt();
            
            valorHora.add(valor);
           
            dias++;
        }
        teclado.close();

        for (int dia = 0; dia < valorHora.size(); dia++) {
            
            valor = valorHora.get(dia) * horasTrabajadas.get(dia);
            
            totalDia.add(valor);
        }

        for (int i :totalDia){
            
            sumaFinal += i;
        }

        System.out.println("El monto a cobrar por dia será de:" + totalDia);
        
        System.out.println("El monto semanal será de: " + sumaFinal);

    }
}