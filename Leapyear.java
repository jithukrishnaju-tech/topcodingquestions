public class Leapyear {
  public static void main(String[] args) {
    int year = 2004;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println("Leap year");
          return;
        }
        System.out.println("Not leap year");
        return;
      }
      System.out.println("Leap year");
      return;
    }

  }
}
