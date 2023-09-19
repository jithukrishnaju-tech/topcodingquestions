import java.util.Arrays;

public class Nonrepeat {
  public static void main(String[] args) {
    String s = "preinsta";
    // non repeating are p r e i n s t a
    int[] p = new int[s.length()];
    char[] str = s.toUpperCase().toCharArray();
    System.out.println(Arrays.toString(str));
    for (int i = 0; i < str.length; i++) {
      p[i] = 1;
      for (int j = i + 1; j < str.length; j++) {
        if (str[i] == str[j]) {
          p[i]++;
          str[j] = ' ';
        }
      }
    }
    System.out.println(Arrays.toString(p));
    for (int i = 0; i < str.length; i++) {
      if (p[i] == 1) {
        System.out.print(str[i] + "-");
      }
    }
  }
}
