
import java.util.Arrays;

public class RepeatChar {
  public static void main(String[] args) {
    String s = "Daddy";
    s.replace("[\\s]", "");
    int[] freq = new int[s.length()];
    char[] str = s.toUpperCase().toCharArray(); // ['D','A','D','D','Y']
    for (int i = 0; i < s.length(); i++) {
      freq[i] = 1;
      for (int j = i + 1; j < s.length(); j++) {
        if (str[i] == str[j]) {
          freq[i] = freq[i] + 1;
          str[j] = ' ';
        }
      }
    }
    System.out.println(Arrays.toString(freq));
    for (int i = 0; i < s.length(); i++) {
      if (str[i] != ' ') {
        System.out.println(str[i] + "-" + freq[i]);
      }
    }
  }
}
