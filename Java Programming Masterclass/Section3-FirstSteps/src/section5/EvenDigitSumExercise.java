package section5;

public class EvenDigitSumExercise {

  public static void main(String[] args) {
    print(123456789);
    print(13579);
    print(12345);
    print(-22);
    print(252);
  }

  public static void print(int number) {
    System.out.println("Even digits sum from " + number + " is equal to " + getEvenDigitSum(number));
  }

  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }
    int sum = 0, digit = 0;
    while (number > 0) {
      digit = number % 10;
      if (digit % 2 == 0) {
        sum += digit;
      }
      number /= 10;
    }
    return sum;
  }

}
