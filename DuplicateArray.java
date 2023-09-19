import java.util.Arrays;

public class DuplicateArray {
  public static void main(String[] args) {
    int[] arr = { 21, 30, 10, 2, 10, 20, 30, 11 };
    int[] p = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      p[i] = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          p[i]++;
          arr[j] = -1;
        }
      }
    }
    System.out.println(Arrays.toString(p));
    // Non duplicate elements
    for (int i = 0; i < p.length; i++) {
      if (arr[i] != -1 && p[i] <= 1) {
        System.out.println(arr[i]);
      }
    }
  }
}
