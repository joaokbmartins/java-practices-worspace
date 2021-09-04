package section5;

public class DayOfWeekChallenge {

  public static void main(String[] args) {
    int day = 3;
    int invalidDay = 0;
    printDayOfTheWeek(day);
    printDayOfTheWeekIf(day);
    printDayOfTheWeek(invalidDay);
    printDayOfTheWeekIf(invalidDay);
  }

  public static void printDayOfTheWeek(int day) {
    switch (day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Thursday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Tuesday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid day");
    }
  }

  public static void printDayOfTheWeekIf(int day) {
    if (day == 1) {
      System.out.println("Sunday");
    } else if (day == 2) {
      System.out.println("Monday");
    } else if (day == 3) {
      System.out.println("Thursday");
    } else if (day == 4) {
      System.out.println("Wednesday");
    } else if (day == 5) {
      System.out.println("Tuesday");
    } else if (day == 6) {
      System.out.println("Friday");
    } else if (day == 7) {
      System.out.println("Saturday");
    } else {
      System.out.println("Invalid day");
    }
  }

}
