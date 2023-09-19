public class LongestPalindrome {
  public static void main(String[] args) {
    int[] arr = { 121, 2322, 54545, 999990 };
    int ans = checkpalindrome(arr);
    System.out.println(ans);
  }

  static int checkpalindrome(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      int digit = arr[i];
      int n = arr[i];
      int rev = 0;
      while (n > 0) {
        int d = n % 10;
        rev = rev * 10 + d;
        n = n / 10;
      }
      int maxLength = 0;

      if (rev == digit) {
        int digitlen = getLength(rev);
        if (digitlen > maxLength) {
          ans = rev;
          maxLength = digitlen;
        }
      }
    }
    return ans;
  }

  public static int getLength(int integer) {
    int length = 0;
    while (integer > 0) {
      integer /= 10;
      length++;
    }
    return length;
  }
}
