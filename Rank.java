import java.util.Arrays;

public class Rank {
  public static void main(String[] args) {
    int[] input = { 100, 2, 70, 12, 90 }; // 2,12,70,90,100
    int[] array = Arrays.copyOfRange(input, 0, input.length);
    int[] p = new int[input.length];
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (input[i] == array[j]) {
          p[i] = j + 1;
          break;
        }
      }
    }
    System.out.println(Arrays.toString(p));
  }
}
