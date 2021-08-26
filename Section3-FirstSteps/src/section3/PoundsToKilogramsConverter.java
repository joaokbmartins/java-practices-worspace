package section3;

public class PoundsToKilogramsConverter {

  public static void main(String[] args) {

    final double IB_TO_KG = 0.45359237d;
    double pounds = 2d;
    double kilograms = pounds * IB_TO_KG;

    System.out.println(pounds + " pounds = " + kilograms + " kilograms");

  }

  
}
