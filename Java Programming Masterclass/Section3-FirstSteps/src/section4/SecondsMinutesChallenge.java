package section4;

public class SecondsMinutesChallenge {

  public static void main(String[] args) {
    getDurationString(0, 1);
  }

  public static String getDurationString(long minutes, long seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return "Invalid Value";
    }
    seconds += (minutes / 60);

    int hour = 0, minute = 0, second = 0;

    seconds = 8274;

    float h = seconds / 3600f;
    hour = (int) seconds / 3600;
    System.out.println(h);
    System.out.println(Math.round((Integer.valueOf((Float.valueOf(h - hour).toString().replace(".", ""))))));
    System.out.println((h - hour) * 100);

    minute = (int) ((seconds / 3600) - hour);

    String res = (hour < 9 ? "0" + hour : hour) + "h ";
    res += (minute < 9 ? "0" + minute : minute) + "m ";
    res += (second < 9 ? "0" + Math.round(second) : second) + "s ";
    System.out.println(res);

    return null;
  }

}