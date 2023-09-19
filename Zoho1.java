import java.util.Arrays;

public class Zoho1 {
  public static void main(String[] args) {
    int[] arr = { 10, 36, 54, 89, 12 };
    // 5 if a perfect square
    // 4 if multiple of 4 and divisible by 6
    // 3 if even number
    int[] wei = new int[arr.length];
    System.out.println(Math.sqrt(16));
    for (int i = 0; i < arr.length; i++) {
      double squareRoot = (int) Math.sqrt(arr[i]);
      if (arr[i] == (squareRoot * squareRoot)) {
        wei[i] += 5;
      }
      if (arr[i] % 4 == 0 && arr[i] % 6 == 0) {
        wei[i] += 4;
      }
      if (arr[i] % 2 == 0) {
        wei[i] += 3;
      }
    }
    System.out.println(Arrays.toString(wei));
    for (int i = 0; i < wei.length; i++) {

    }
  }
}
