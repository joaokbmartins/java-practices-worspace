package section5;

public class FirstAndLastDigitSumExercise {

  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(252));
    System.out.println(sumFirstAndLastDigit(6548));
    System.out.println(sumFirstAndLastDigit(0));
    System.out.println(sumFirstAndLastDigit(578));
    System.out.println(sumFirstAndLastDigit(1154));
    System.out.println(sumFirstAndLastDigit(5));
    System.out.println(sumFirstAndLastDigit(10));
    System.out.println(sumFirstAndLastDigit(-10));
  }

  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    } else if (number == 0) { // number < 10
      return number;
    }
    int res = number % 10;
    do {
      if (number < 10) {
        res += number;
      }
      number = number / 10;
    } while (number > 0);
    return res;
  }

}
