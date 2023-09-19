public class SpaceRemove {
  // Write a code to Remove space from a string
  public static void main(String[] args) {
    String str1 = "java is a programming language";
    System.out.println(str1);
    str1 = str1.replaceAll("\\s", "");
    System.out.println(str1);
  }
}
