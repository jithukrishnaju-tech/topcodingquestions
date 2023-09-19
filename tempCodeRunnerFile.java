public class Armstrong {
  public static void main(String[] args) {
    int n = 150;
    int number = n;
    int len = Integer.toString(n).length();
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += (int) Math.pow(digit, len);
      n = n / 10;
    }
    if (sum == number) {
      System.out.println("Armstrong");
      return;
    }
    System.out.println("Not armstrong");

  }
}
