import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    if (sum == n) {
      System.out.println("sum=" + sum + n + " is a perfect number");
      return;
    }
    System.out.println("sum=" + sum + n + " is not a perfect number");
  }
}
