package ComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

  public static void main(String[] args) {
    List<Long> numeros = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L);

    List<Long> collect = numeros.stream().map(num -> num * num).collect(Collectors.toList());
    System.out.println(collect);
  }
}
