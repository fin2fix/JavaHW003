import java.util.Arrays;

/**
 * Задание №1.
 * Реализовать алгоритм сортировки слиянием.
 */
public class s3dz01 {

  public static void main(String[] args) {

    int[] startArray = new int[] { 42, 1, 60, 13, 52, 7, 0, 22, 30, 10 };
    System.out.println("Стартовый массив");
    System.out.println(Arrays.toString(startArray));
    int[] tempArray = new int[startArray.length];

    sort(startArray, 0, startArray.length - 1, tempArray);
    System.out.println();
    System.out.println("Отсортированный массив");
    System.out.println(Arrays.toString(startArray));
  }

  private static void sort(int[] startArray, int minNum, int maxNum, int[] tempArray) {
    if (minNum < maxNum) {
      int middleNum = (minNum + maxNum) / 2;
      sort(startArray, minNum, middleNum, tempArray);
      sort(startArray, middleNum + 1, maxNum, tempArray);
      merge(startArray, minNum, middleNum, maxNum, tempArray);
    }
  }

  private static void merge(int[] startArray, int minNumber, int middleNumber, int maxNumber, int[] tempArray) {
    int tempMinNum = minNumber;
    int tempMidnum = middleNumber + 1;
    int count = 0;

    while (tempMinNum <= middleNumber && tempMidnum <= maxNumber) {
      if (startArray[tempMinNum] <= startArray[tempMidnum]) {
        tempArray[count++] = startArray[tempMinNum++];
      } else {
        tempArray[count++] = startArray[tempMidnum++];
      }
    }

    while (tempMinNum <= middleNumber) {
      tempArray[count++] = startArray[tempMinNum++];
    }
    while (tempMidnum <= maxNumber) {
      tempArray[count++] = startArray[tempMidnum++];
    }

    count = 0;
    while (minNumber <= maxNumber) {
      startArray[minNumber++] = tempArray[count++];
    }
  }
}