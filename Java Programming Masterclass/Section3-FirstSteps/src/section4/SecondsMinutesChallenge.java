package section4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SecondsMinutesChallenge {

  public static void main(String[] args) {
    getDurationString(0, 1);
  }

  public static String getDurationString(long minutes, long seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return "Invalid Value";
    }

    double totSec = 2d;
//    totSec = 8274d;

    System.out.println(">>> " + (1f / 3600f));

    System.out.println(BigDecimal.valueOf(Double.parseDouble(k(double) (1d / 3600d))).setScale(2, RoundingMode.HALF_UP).doubleValue());

//    double secToHour = (totSec / 3600d);
//    System.out.println(secToHour);
//
//    int hour = (int) secToHour;
//    System.out.println(hour);
//
//    double secToMin = (secToHour - hour) * 60d;
//    System.out.println(secToMin);
//
//    int minute = (int) secToMin;
//    System.out.println(minute);
//
//    double remainingSec = ((secToMin) - minute);
//    System.out.println(remainingSec);

    return null;
  }

}