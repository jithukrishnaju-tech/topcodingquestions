import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    if (n <= 1) {
      System.out.println(a);
      return;
    }
    for (int i = 2; i < n; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    System.out.println(b);
  }
}
