package section5;

public class NumberOfDaysInMonth {

  public static void main(String[] args) {
    System.out.println(isLeapYear(-1600));
    System.out.println(isLeapYear(1600));
    System.out.println(isLeapYear(2017));
    System.out.println(isLeapYear(2000));
    System.out.println("----------------");
    System.out.println(getDaysInMonth(1, 2020));
    System.out.println(getDaysInMonth(2, 2020));
    System.out.println(getDaysInMonth(2, 2018));
    System.out.println(getDaysInMonth(-1, 2020));
    System.out.println(getDaysInMonth(1, -2020));
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    }
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true;
    }
    return false;
  }

  public static int getDaysInMonth(int month, int year) {
    if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
      return -1;
    }
    int result = 0;
    switch (month) {
      case 1:
        result = 31;
        break;
      case 2:
        result = isLeapYear(year) ? 29 : 28;
        break;
      case 3:
        result = 31;
        break;
      case 4:
        result = 30;
        break;
      case 5:
        result = 31;
        break;
      case 6:
        result = 30;
        break;
      case 7:
        result = 31;
        break;
      case 8:
        result = 31;
        break;
      case 9:
        result = 30;
        break;
      case 10:
        result = 31;
        break;
      case 11:
        result = 30;
        break;
      case 12:
        result = 31;
        break;
      default:
        result = -1;
        break;
    }
    return result;
  }

}
