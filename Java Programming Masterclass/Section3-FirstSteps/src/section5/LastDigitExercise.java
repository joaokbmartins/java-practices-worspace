package section5;

public class LastDigitExercise {

  public static void main(String[] args) {
    System.out.println(hasSameLastDigit(1, 11, 111));
    System.out.println(hasSameLastDigit(11, 111, 1111));
    System.out.println(hasSameLastDigit(11, 111, 111));

    System.out.println(hasSameLastDigit(11, 21, 32));
    System.out.println(hasSameLastDigit(12, 21, 31));
    System.out.println(hasSameLastDigit(11, 22, 31));
  }

  public static boolean hasSameLastDigit(int n1, int n2, int n3) {
    if (n1 < 10 || n2 < 10 || n3 < 10 || n1 > 1000 || n2 > 1000 || n3 > 1000) {
      return false;
    }
    int d1 = n1 % 10;
    int d2 = n2 % 10;
    int d3 = n3 % 10;
    return d1 == d2 && d2 == d3 || d1 == d2 || d1 == d3 || d2 == d3;
  }

  public static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }

}
