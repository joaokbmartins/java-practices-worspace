package section4;

public class LeapYearCalculator {

  public static void main(String[] args) {
    int[] years = {-1500, 1700, 1800, 1900, 2017, 2100, 2200, 2300, 2500, 2600, 1600, 2000, 2400, 1924};
    for (int year : years) {
      System.out.println("YEAR: " + year + ": " + isLeapYear(year));
    }
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    } else if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          return true;
        }
      } else {
        return true;
      }
    }
    return false;
  }

}
