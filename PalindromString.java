import java.util.Arrays;

public class PalindromString {

  public static void main(String[] args) {
    String s1 = "mom";
    char[] news1 = s1.toCharArray();
    int leng = news1.length;
    String newstr = "";
    for (int i = leng - 1; i >= 0; i--) {
      newstr = newstr + news1[i];
    }
    char[] newstr1 = newstr.toCharArray();
    boolean ans = Arrays.equals(news1, newstr1);
    System.out.println(ans);

  }

  // abcd
  public static boolean reverse(String s) {
    String str = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      str = str + s.charAt(i);
    }
    return s.equals(str);
  }
}
