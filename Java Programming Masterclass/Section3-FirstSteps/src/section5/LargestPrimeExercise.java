package section5;

public class LargestPrimeExercise {

  public static void main(String[] args) {
    verify(-1);
    verify(0);
    verify(1);
    verify(2);
    verify(3);
    verify(5);
    verify(17);
    verify(23);
    verify(28);
    verify(100);

  }

  public static void verify( int number ){
    System.out.println(number + " " + getLargestPrime(number));
  }

  public static int getLargestPrime(int number) {
    if (number <= 1) {
      return -1;
    } else if (number == 2 || number == 3) {
      return number;
    }
    // 30
    int prime = 0;
    for (int n = 4; n <= number; n++) {
//      System.out.println("n " + n);
      for (int i = 4; i <= Math.sqrt(n); i++) {
//        System.out.println(" i " + i + " " + String.format("%.4f", Math.sqrt(n)));
        if (n % i != 0) {
//          System.out.println(" n " + n + " i " + i);
          prime = n;
        }
      }
    }
    return prime;
  }

}
