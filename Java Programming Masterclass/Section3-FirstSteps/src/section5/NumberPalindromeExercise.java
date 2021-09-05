package section5;

public class NumberPalindromeExercise {
  public static void main(String[] args) {
    displayResult(12321);
    displayResult(12345);
    displayResult(-12321);
    displayResult(707);
    displayResult(11212);
  }

  private static void displayResult(int number) {
    System.out.println("Number " + number + " is palindrome? " + isPalindrome(number));
  }

  public static boolean isPalindrome(int number) {
    int num = 0, aux = number;
    aux = number < 0 ? aux * -1 : aux;
    while (aux >= 1) {
      int x = aux % 10;
      num = num == 0 ? x : num * 10 + x;
      aux = aux / 10;
    }
    num = number < 0 ? num * -1 : num;
    return number == num;
  }

}
