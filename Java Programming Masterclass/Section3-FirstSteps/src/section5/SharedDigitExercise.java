package section5;

public class SharedDigitExercise {

  public static void main(String[] args) {
    System.out.println(hasSharedDigit(10, 20));
    System.out.println(hasSharedDigit(9, 99));
    System.out.println(hasSharedDigit(11, 33));
    System.out.println(hasSharedDigit(12, 21));
    System.out.println(hasSharedDigit(10, 100));
  }

  public static boolean hasSharedDigit(int n1, int n2) {
    if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
      return false;
    }
    int d1 = n1 % 10;
    n1 /= 10;
    int d2 = n1;
    while (n2 > 0) {
      if (n2 % 10 == d1 || n2 % 10 == d2) {
        return true;
      }
      n2 /= 10;
    }
    return false;
  }

}
