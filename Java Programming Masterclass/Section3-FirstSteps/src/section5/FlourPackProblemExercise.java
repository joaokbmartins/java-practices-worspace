package section5;

public class FlourPackProblemExercise {
  public static void main(String[] args) {
    System.out.println(canPack(1, 0, 4));
    System.out.println(canPack(1, 0, 5));
    System.out.println(canPack(0, 5, 4));
    System.out.println(canPack(2, 2, 11));
    System.out.println(canPack(-3, 2, 12));
    System.out.println(canPack(2, 1, 5));
    System.out.println(canPack(2, 1, 4));
    System.out.println(canPack(2, 0, 9));
    System.out.println(canPack(4, 18, 19));
    System.out.println(canPack(1, 0, 5));
    System.out.println(canPack(2, 2, 12));
    System.out.println(canPack(1, 0, 4));
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    } else if (smallCount >= goal || bigCount * 5 == goal) {
      return true;
    }
    for (int i = 1; i <= bigCount; i++) {
      if (goal < i * 5) {
        return false;
      } else if (smallCount + 5 * i >= goal) {
        return true;
      }
    }
    return false;
  }

}
