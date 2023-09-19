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
    int powers = power(2, 2);
    System.out.println(powers);
  }

  static int power(int base, int exponent) {
    int ans = 1;
    for (int i = 0; i < exponent; i++) {
      ans = ans * base;
    }
    return ans;
  }
}
