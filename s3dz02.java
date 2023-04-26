import java.util.ArrayList;
import java.util.Arrays;

/* Задание №2
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

public class s3dz02 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    System.out.println(numbers);

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0) {
        numbers.remove(i);
      }
    }
    System.out.println(numbers);

  }
}
