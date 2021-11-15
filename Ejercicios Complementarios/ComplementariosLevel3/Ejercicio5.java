import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

  public static void main(String[] args) {
    List<Alumno> alumnos = List.of(new Alumno("Alumno1", "Apellido1", LocalDate.of(1994, 11, 1)),
        new Alumno("Alumno2", "Apellido2", LocalDate.of(1980, 2, 20)),
        new Alumno("Alumno3", "Apellido3", LocalDate.of(1924, 9, 1)),
        new Alumno("Alumno4", "Apellido4", LocalDate.of(1964, 11, 28)),
        new Alumno("Alumno5", "Apellido5", LocalDate.of(2000, 2, 29)));
    Map<String, Integer> edades = new HashMap<>();

    for (Alumno alumno : alumnos) {
      edades.put(alumno.getApellido() + " " + alumno.getNombre(),
          alumno.getNacimiento().until(LocalDate.now()).getYears());
    }

    System.out.println(edades);
  }
}
