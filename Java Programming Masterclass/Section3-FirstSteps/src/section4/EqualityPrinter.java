package section4;

public class EqualityPrinter {

  public static void main(String[] args) {
    printEqual(1, 1, 1);
    printEqual(1, 1, 2);
    printEqual(-1, -1, -1);
    printEqual(1, 2, 3);
  }

  public static void printEqual(int f, int s, int t) {
    if (f < 0 || s < 0 || t < 0) {
      System.out.println("Invalid Value");
    } else if (f == s && s == t) {
      System.out.println("All numbers are equal");
    } else if (f != s && s != t && f != t) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither all are equal or different");
    }
  }

}
