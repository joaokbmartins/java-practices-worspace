package section5;

public class PerfectNumberExercise {

  public static void main(String[] args) {
    check(6);
    check(28);
    check(5);
    check(-1);
  }

  public static void check(int number) {
    System.out.println(number + " is a perfect number? " + isPerfectNumber(number));
  }

  public static boolean isPerfectNumber(int number) {
    if (number < 1) {
      return false;
    }
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }

}
