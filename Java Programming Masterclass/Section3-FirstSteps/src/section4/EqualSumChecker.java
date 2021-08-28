package section4;

public class EqualSumChecker {

  public static void main(String[] args) {
    System.out.println(hasEqualSum(1, 1, 1));
    System.out.println(hasEqualSum(1, 1, 2));
    System.out.println(hasEqualSum(1, -1, 0));
  }

  public static boolean hasEqualSum(int n1, int n2, int n3) {
    return n1 + n2 == n3;
  }

}
