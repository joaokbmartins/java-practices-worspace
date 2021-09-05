package section5;

public class DigitSumChallenge {

  public static void main(String[] args) {
    System.out.println(sumDigit(99999999999999999L));
  }

  private static int sumDigit(long number) {
    if (number < 0) {
      return -1;
    } else if (number < 10) {
      return (int) number;
    }
    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number /= 10;
    }
    return sum;
  }

//  public static int sumDigit(int number) {
//    if (number < 0) {
//      return -1;
//    } else if (number < 10) {
//      return number;
//    }
//    String num = String.valueOf(number);
//    int sum = 0;
//    for (int i = 0; i < num.length(); i++) {
//      sum += Integer.parseInt(String.valueOf(num.toCharArray()[i]));
//    }
//    return sum;
//  }

}
