package section5;

public class Sum3And5Challenge {

  public static void main(String[] args) {
    int end = 1000;
    int sum = 0;
    int count = 0;
    for (int i = 1; i <= end; i++) {
      if (count == 5) {
        break;
      }
      if ((i % 3 == 0) && (i % 5 == 0)) {
        count++;
        sum += i;
        System.out.println(i + " found.");
      }
    }
    System.out.println("Total: " + sum);
  }
}
