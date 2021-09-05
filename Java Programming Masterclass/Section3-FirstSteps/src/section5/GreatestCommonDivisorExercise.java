package section5;

public class GreatestCommonDivisorExercise {

  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(15, 30));
    System.out.println(getGreatestCommonDivisor(12, 12));
    System.out.println(getGreatestCommonDivisor(25, 15));
    System.out.println(getGreatestCommonDivisor(12, 30));
    System.out.println(getGreatestCommonDivisor(9, 18));
    System.out.println(getGreatestCommonDivisor(81, 153));
  }

  public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) {
      return -1;
    }
    int smaller = Math.min(first, second);
    int lastDivisor = 1;
    for (int i = 1; i <= smaller; i++) {
      double r1 = (double) first / i;
      double r2 = (double) second / i;
      if (r1 == (int) r1 && r2 == (int) r2) {
        lastDivisor = i;
      }
    }
    return lastDivisor;
  }

}
