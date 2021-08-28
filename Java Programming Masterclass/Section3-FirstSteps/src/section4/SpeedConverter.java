package section4;

public class SpeedConverter {

  public static void main(String[] args) {
    Teste.printConversion(1.5);
    Teste.printConversion(10.25);
    Teste.printConversion(-10.25);
    Teste.printConversion(25.42);
    Teste.printConversion(75.114);
  }

}

class Teste {

  public static long toMilesPerHour(double kilometersPerHour) {

    if (kilometersPerHour < 0) {
      return -1;
    }

    return Math.round(kilometersPerHour / 1.609d);
  }

  public static void printConversion(double kilometersPerHour) {
    long mih = toMilesPerHour(kilometersPerHour);
    if (mih < 0) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
  }

}