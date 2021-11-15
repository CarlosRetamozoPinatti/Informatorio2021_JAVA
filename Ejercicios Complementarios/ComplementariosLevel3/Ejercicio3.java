import java.util.List;

public class Ejercicio3 {
  private static final String LETRA_INICIO = "b";

  public static void main(String[] args) {
    List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

    long count = 0;

    count = palabras.stream().filter(Ejercicio3::filtrarPorInicio).count();
    System.out.println(count);
  }

  private static boolean filtrarPorInicio(String s) {
    return s != null && !s.isEmpty() && LETRA_INICIO.equalsIgnoreCase(s.substring(0, 1));
  }
}
