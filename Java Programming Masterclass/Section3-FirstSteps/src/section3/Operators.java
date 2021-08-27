package section3;

public class Operators {

  public static void main(String[] args) {

    double one = 20d;
    double two = 80d;
    double three = (one + two) * 100;
    double remainder = three % 40d;
    boolean isRemainderZero = (remainder == 0);

    System.out.println("Is remainder equal zero ? " + isRemainderZero);

    if (!isRemainderZero) {
      System.out.println(" Got some remainder. ");
    }

  }

}
