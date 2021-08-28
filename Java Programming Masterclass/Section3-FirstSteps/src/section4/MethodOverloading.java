package section4;

public class MethodOverloading {

  public static void main(String[] args) {
    calcFeetAndInchesToCentimeters(0, 6);
    System.out.println(calcFeetAndInchesToCentimeters(10));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12) {
      return -1;
    }
    System.out.println("InchesCM: " + inches * 2.54);
    System.out.println("FeetCM: " + feet * 2.54 * 12);
    return inches * 2.54 + feet * 12 * 2.54;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    return inches < 0 ? -1 : inches / 12;
  }

}
