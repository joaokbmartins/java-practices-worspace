package section3;

public class App {

  public static void main(String[] args) {

    byte byteMin = Byte.MIN_VALUE;
    byte byteMax = Byte.MAX_VALUE;
    System.out.printf("08 bits | byteMin: %1d, byteMax: %2d\n", byteMin, byteMax);
    short shortMin = Short.MIN_VALUE;
    short shortMax = Short.MAX_VALUE;
    System.out.printf("16 bits | shortMin: %1d, shortMax: %2d\n", shortMin, shortMax);
    int integerMin = Integer.MIN_VALUE;
    int integerMax = Integer.MAX_VALUE;
    System.out.printf("32 bits | intMin: %1d, intMax: %2d\n", integerMin, integerMax);
    long longMin = Long.MIN_VALUE;
    long longMax = Long.MAX_VALUE;
    System.out.printf("64 bits | longMin: %1d, longMax: %2d\n", longMin, longMax);
    float floatMin = Float.MIN_VALUE;
    float floatMax = Float.MAX_VALUE;
    System.out.printf("floatMin: %1f, floatMax: %2f\n", floatMin, floatMax);
    double doubleMin = Double.MIN_VALUE;
    double doubleMax = Double.MAX_VALUE;
    System.out.printf("doubleMin: %1f, doubleMax: %2f\n", doubleMin, doubleMax);

    long maximus = ((long) byteMax + (long) shortMax + (long) integerMax);
    System.out.println("maximus: " + maximus);
    long times10 = maximus * 10L;
    System.out.println("times10: " + times10);
    long total = 50000L + times10;
    System.out.println("Total  : " + total);

    float var = 5.43F;
  }

}