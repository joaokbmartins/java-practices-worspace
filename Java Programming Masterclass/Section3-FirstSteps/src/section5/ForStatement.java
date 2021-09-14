package section5;

public class ForStatement {

  public static void main(String[] args) {

//    for (int i = 0; i < 2; i++) {
//      System.out.println("i");
//      i--;
//    }

//    int amount = 10000;
//    for (int i = 2; i <= 8; i++) {
//      printResult(amount, i);
//    }
//    System.out.println("----");
//    for (int i = 8; i >= 2; i--) {
//      printResult(amount, i);
//    }
//    System.out.println("-----");
//    int total = 100;
//    int primeCounter = 0;
//    final int LIMIT = 10;
//    for (int i = 0; i <= total; i++) {
//      if (isPrime(i)) {
//        System.out.println(i + " is prime.");
//        primeCounter++;
//        if (primeCounter == LIMIT) {
//          break;
//        }
//      }
//    }
    if (isPrime(c)) {
      System.out.println(c + " prime");
    }
    for (int c = 0; c <= 100; c++) {
    }
  }

  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
//  3
    number = 100;
    for (int c = 0; c <= number; c++) {
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void printResult(int amount, int interest) {
    System.out.println(amount + " at " + interest + "% interest = " + String.format("%.2f", calculateInterest(amount, interest)));
  }

  public static double calculateInterest(double amount, double interest) {
    return amount * interest / 100;
  }

}
