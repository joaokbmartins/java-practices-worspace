package section4;

public class MethodOverloading {

  public static void main(String[] args) {
    calcFeetAndInchesToCentimeters(6, 0);
    calcFeetAndInchesToCentimeters(7, 5);
    calcFeetAndInchesToCentimeters(1, 0);
    calcFeetAndInchesToCentimeters(0, 1);
    calcFeetAndInchesToCentimeters(7, -5);
    calcFeetAndInchesToCentimeters(7, 13);
    calcFeetAndInchesToCentimeters(-7, 5);
    calcFeetAndInchesToCentimeters(-7, -5);
    calcFeetAndInchesToCentimeters(100);
    calcFeetAndInchesToCentimeters(156);
    calcFeetAndInchesToCentimeters(-10);
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12) {
      System.out.println("Invalid Values");
      return -1;
    }
    double inchesCm = inches * 2.54d;
    double feetCm = feet * 2.54d * 12;
    System.out.println(feet + " feet, " + inches + " inches = " + (inchesCm + feetCm) + " cm");
    return inchesCm + feetCm;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      System.out.println("Invalid Inches");
      return -1;
    }
    double feet = (long) inches / 12;
    double remainingInches = (long) inches % 12;
    System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
    return calcFeetAndInchesToCentimeters(feet, remainingInches);
  }

}
