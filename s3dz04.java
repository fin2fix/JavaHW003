import java.util.ArrayList;
import java.util.Arrays;

/*
 * Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
 */

public class s3dz04 {
  public static void main(String[] args) {

    // Заданные коллекции
    ArrayList<Integer> numbers1 = new ArrayList<>();
    numbers1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    System.out.print("Коллекция А  ");
    System.out.println(numbers1);

    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.addAll(Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12));
    System.out.print("Коллекция В  ");
    System.out.println(numbers2);

    // Результаты вычислений
    ArrayList<Integer> resultAminB = minusColl(numbers1, numbers2);
    System.out.println();
    System.out.print("Результат А минус В   ");
    System.out.println(resultAminB);

    ArrayList<Integer> resultBminA = minusColl(numbers2, numbers1);
    System.out.println();
    System.out.print("Результат В минус А   ");
    System.out.println(resultBminA);

    ArrayList<Integer> simResult = minusColl(numbers1, numbers2);
    ArrayList<Integer> temp = minusColl(numbers2, numbers1);
    for (int i = 0; i < temp.size(); i++) {
      simResult.add(temp.get(i));
    }
    System.out.println();
    System.out.print("Результат A ^ B   ");
    System.out.println(simResult);

  }

  private static ArrayList<Integer> minusColl(ArrayList<Integer> numbersA, ArrayList<Integer> numbersB) {
    ArrayList<Integer> result = new ArrayList<>();
    int flag = 0;
    for (int i = 0; i < numbersA.size(); i++) {
      for (int j = 0; j < numbersB.size(); j++) {
        if (numbersA.get(i).equals(numbersB.get(j))) {
          flag += 1; // если есть совпадение flag = 1
        } else {
          flag += 0; // если нет совпадений flag = 0
        }
      }
      if (flag < 1) { // если совпадений не было (флаг<1), то добавляем в новый список
        result.add(numbersA.get(i));
      }
      flag = 0;
    }
    return result;
  }
}
