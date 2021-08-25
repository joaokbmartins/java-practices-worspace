package section3;

public class App {

  public static void main(String[] args) {

    byte byteMin = Byte.MIN_VALUE;
    byte byteMax = Byte.MAX_VALUE;
    System.out.format("byteMin: %1d, byteMax: %2d\n", byteMin, byteMax);
    short shortMin = Short.MIN_VALUE;
    short shortMax = Short.MAX_VALUE;
    System.out.format("shortMin: %1d, shortMax: %2d\n", shortMin, shortMax);
    int integerMin = Integer.MIN_VALUE;
    int integerMax = Integer.MAX_VALUE;
    System.out.format("integerMin: %1d, integerMax: %2d\n", integerMin, integerMax);
    long longMin = Long.MIN_VALUE;
    long longMax = Long.MAX_VALUE;
    System.out.format("longMin: %1d, longMax: %2d\n", longMin, longMax);
    float floatMin = Float.MIN_VALUE;
    float floatMax = Float.MAX_VALUE;
    System.out.format("floatMin: %1f, floatMax: %2f\n", floatMin, floatMax);
    double doubleMin = Double.MIN_VALUE;
    double doubleMax = Double.MAX_VALUE;
    System.out.format("doubleMin: %1f, doubleMax: %2f\n", doubleMin, doubleMax);

  }

}
