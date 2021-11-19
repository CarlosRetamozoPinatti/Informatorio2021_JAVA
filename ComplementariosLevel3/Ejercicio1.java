package ComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

  public static void main(String[] args) {
    List<String> palabras = new ArrayList<>();
    palabras.add("HOLA");
    palabras.add("");
    palabras.add(null);
    palabras.add("MUNDO");

    List<String> collect = palabras.stream().filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());

    System.out.println(collect);
    //
  }
}
