import java.util.ArrayList;
import java.util.Arrays;

/* Задание №3
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
 */

public class s3dz03 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
    System.out.println(numbers);

    int min = Integer.MAX_VALUE;
    int max = 0;
    double sum = 0;

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > max)
        max = numbers.get(i);
      if (numbers.get(i) < min)
        min = numbers.get(i);
      sum += numbers.get(i);
    }
    System.out.printf("MIN = %d, MAX = %d, Average = %.1f", min, max, sum / numbers.size());

  }
}
