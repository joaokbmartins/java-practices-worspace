package section5;

public class AllFactorsExercise {

  public static void main(String[] args) {
    printFactors(6);
    printFactors(32);
    printFactors(10);
    printFactors(-1);
  }

  public static void printFactors(int number) {
    if (number < 1) {
      System.out.println("Invalid Value");
    } else {
//      System.out.print("All factors from " + number + ": ");
      for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
          System.out.print(i + " ");
        }
      }
      System.out.println();
    }
  }

}
