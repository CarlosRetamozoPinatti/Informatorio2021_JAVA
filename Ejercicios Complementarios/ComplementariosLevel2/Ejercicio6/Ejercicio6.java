package Ejercicio6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 6.	Se dispone de una lista de Empleados, de cada empleado se conoce:
○	Nombre y Apellido
○	DNI
○	horasTrabajadas
○	valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario)
donde la clave (key) es el dni y el valor (value) es el sueldo calculado. */

public class Ejercicio6 {

    public static void main(String[] args) {
        //Definiendo el tipo de dato que va a contener la variable diccionario (def de la variable)
        Map<Integer, Integer> Diccionario;
        
        Diccionario = new HashMap<>();

        Set<Empleado> lista ; //definimos lista como una  collection Set que contiene empleados
        
        lista = new HashSet<>(); // al ser set una interfase, la instanciamos como HashSet
        //instanciar un nuevo objeto empleado, al cual le asigne los valores a sus propiedades, para agregar a la colection lista.
        lista.add(new Empleado("Carlos", "Villagran", 34434488, 9, 340));
        
        lista.add(new Empleado("Florinda", "Meza", 36322808, 3, 332));
        
        lista.add(new Empleado("Ramon", "Valdez", 13588606, 8, 310));
        
        lista.add(new Empleado("Angelines", "Fernandez", 6238945, 6, 456));
        
        lista.add(new Empleado("Edgar", "Vibar", 22216554, 8, 440));

        for (Empleado emp : lista) {
            
            int sueldo = emp.calcularSueldo();
            
            Diccionario.put(emp.dni, sueldo);
        }
        System.out.print(Diccionario);
    }
}