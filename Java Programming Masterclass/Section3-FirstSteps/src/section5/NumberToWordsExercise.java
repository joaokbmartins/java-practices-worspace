package section5;

public class NumberToWordsExercise {

  public static void main(String[] args) {
    System.out.println(getDigitCount(0));
    System.out.println(getDigitCount(123));
    System.out.println(getDigitCount(-12));
    System.out.println(getDigitCount(5200));
    System.out.println("********");
    System.out.println(reverse(-121));
    System.out.println(reverse(1212));
    System.out.println(reverse(1234));
    System.out.println(reverse(100));
    System.out.println("********");
    numberToWords(123);
    numberToWords(1010);
    numberToWords(1000);
    numberToWords(-12);
  }

  public static int getDigitCount(int number) {
    if (number < 0) {
      return -1;
    } else if (number == 0) {
      return 1;
    }
    int counter = 0;
    while (number > 0) {
      counter++;
      number /= 10;
    }
    return counter;
  }

  public static int reverse(int number) {
    int reverse = 0;
    int aux = number;
    number = number < 0 ? number * -1 : number;
    while (number > 0) {
      int digit = number % 10;
      if (reverse == 0) {
        reverse = digit;
      } else {
        reverse = reverse * 10 + digit;
      }
      number /= 10;
    }
    reverse = aux < 0 ? reverse * -1 : reverse;
    return reverse;
  }

  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.print("Invalid Value");
    } else if (number == 0) {
      System.out.print("Zero ");
    } else {
      int digit;
      int reverse = reverse(number);
      int digitCountReverse = getDigitCount(reverse);
      int digitCountNumber = getDigitCount(number);
      while (reverse > 0) {
        digit = reverse % 10;
        switch (digit) {
          case 0:
            System.out.print("Zero");
            break;
          case 1:
            System.out.print("One");
            break;
          case 2:
            System.out.print("Two");
            break;
          case 3:
            System.out.print("Three");
            break;
          case 4:
            System.out.print("Four");
            break;
          case 5:
            System.out.print("Five");
            break;
          case 6:
            System.out.print("Six");
            break;
          case 7:
            System.out.print("Seven");
            break;
          case 8:
            System.out.print("Eight");
            break;
          case 9:
            System.out.print("Nine");
            break;
        }
        System.out.print(" ");
        reverse /= 10;
      }
      for (int i = digitCountReverse; i < digitCountNumber; i++) {
        numberToWords(0);
      }
      System.out.println();
    }
  }

}
