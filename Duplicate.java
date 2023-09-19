public class Duplicate {
  public static void main(String[] args) {
    int[] arr = { 1, 80, 1, 20, 2, 3, 4, 50, 50 };
    int[] dup = new int[200];
    // for (int i = 0; i < arr.length; i++) {
    // if (dup[arr[i]] == 0) {
    // dup[arr[i]] = 1;
    // } else {
    // System.out.println(arr[i]);
    // }
    // }
    nonrepeating(arr, dup);
  }

  // {1,2,3,4,1};
  public static void nonrepeating(int[] arr, int[] dup) {
    for (int i = 0; i < arr.length; i++) {
      dup[arr[i]] = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          dup[arr[i]]++;
        }
      }
      if (dup[arr[i]] == 1) {
        System.out.println(arr[i]);
      }
    }
  }
}
