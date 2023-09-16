import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    s1.replace("[\\s]", "");
    s2.replace("[\\s]", "");
    char[] news1 = s1.toLowerCase().toCharArray();
    char[] news2 = s2.toLowerCase().toCharArray();
    Arrays.sort(news1);
    Arrays.sort(news2);
    System.out.println(news1);
    System.out.println(news2);
    boolean isAnagram = Arrays.equals(news1, news2);
    System.out.println(isAnagram);
  }
}
