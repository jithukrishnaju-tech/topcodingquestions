import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int ans = reverseNumber1(number);
    System.out.println(ans);

  }

  public static int revernumber(int n) {
    int rev = 0;
    while (n > 0) {
      int digit = n % 10;
      rev = 10 * rev + digit;
      n = n / 10;
    }
    return rev;
  }

  public static int reverseNumber1(int n) {
    String s = "";
    while (n > 0) {
      int lastDigit = n % 10;
      s = s + Integer.toString(lastDigit);
    }
    return Integer.parseInt(s);
  }
}
