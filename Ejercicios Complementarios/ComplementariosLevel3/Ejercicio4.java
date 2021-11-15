import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ejercicio4 {

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 4, 4, 4);
    Set<Integer> numerosSinRepetir = new HashSet<>(numeros);

    List<Long> factorial = numerosSinRepetir.stream().map(Ejercicio4::factorial).collect(Collectors.toList());
    System.out.println(factorial);
  }

  private static long factorial(int n) {
    return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
  }
}
