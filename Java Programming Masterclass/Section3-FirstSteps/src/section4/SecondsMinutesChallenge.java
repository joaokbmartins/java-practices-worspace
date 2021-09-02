package section4;

public class SecondsMinutesChallenge {

  public static void main(String[] args) {
    System.out.println(secToMin(3945L));
    System.out.println(getDurationString(65,45));
  }

  public static String getDurationString(long minutes, long seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return "Invalid Value";
    }
    long hour = 0, minute = 0;
    hour = minutes / 60;
    minute = minutes % 60;
    String res = (hour < 9 ? "0" + hour : hour) + "h ";
    res += (minute < 9 ? "0" + minute : minute) + "m ";
    res += (seconds < 9 ? "0" + seconds : seconds) + "s ";
    System.out.println(res);
    return null;
  }

  public static String secToMin(long seconds) {
    if (seconds < 0) {
      return "Invalid value";
    }
    long minutes = seconds / 60;
    seconds = seconds % 60;
    SecondsMinutesChallenge.getDurationString(minutes, seconds);
    return null;
  }

}