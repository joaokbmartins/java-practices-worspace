package section5;

public class WhileDoWhile {

  public static void main(String[] args) {
    System.out.println(isEvenNumber(20));
    int start = 4, end = 20, counter = 0;
    while (start <= end) {
      start++;
      if (!isEvenNumber(start)) {
        continue;
      }
      counter++;
      System.out.println(start);
       if (counter >= 5) {
        break;
      }
    }
    System.out.println("Total even: " + counter);
  }

  public static boolean isEvenNumber(int number) {
    return number % 2 == 0;
  }

}
