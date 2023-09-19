public class DecimalTobinary {
  public static void main(String[] args) {
    int binary = 111;
    int n = binary;
    int sum = 0;
    int count = 0;
    while (n > 0) {
      int digit = n % 10;
      int power = (int) Math.pow(2, count);
      count++;
      sum += (digit * power);
      n = n / 10;
    }
    System.out.println(sum);
  }
}
