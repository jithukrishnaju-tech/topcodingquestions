public class Numberfactorial {
  public static void main(String[] args) {
    int n = 20;
    int count = 2;
    while (count <= n) {
      if (n % count == 0) {
        System.out.println(count);
      }
      count++;
    }
  }
}
