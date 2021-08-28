package section4;

public class DecimalComparator {

  //GAMBIARRA TIME!

  public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    System.out.println(areEqualByThreeDecimalPlaces(-3.123, -3.123));
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.1757));
  }

  public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
    String[] vet1 = String.valueOf(n1).split("\\.");
    String v1 = vet1.length == 2 && vet1[1].length() > 0 ? vet1[1] : null;
    String[] vet2 = String.valueOf(n2).split("\\.");
    String v2 = vet2.length == 2 && vet2[1].length() > 0 ? vet2[1] : null;
    if (Math.round(n1) != Math.round(n2)) {
      return false;
    } else if (v1 == null && v2 == null) {
      return true;
    } else if (v1 != null && v2 != null) {
      if (v1.length() >= 3 && v2.length() >= 3) {
        if (v1.substring(0, 3).equals(v2.substring(0, 3))) {
          return true;
        }
      } else {
        int minLen = v1.length() < v2.length() ? v1.length() : v2.length();
        if (v1.substring(0, minLen).equals(v2.substring(0, minLen))) {
          return true;
        }
      }
    }
    return false;
  }

}
