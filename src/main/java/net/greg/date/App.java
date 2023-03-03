package net.greg.date;

public final class App {

  public static void main(String[] args) throws Exception {

    System.err.println(
      "\n\n\n" + YLW + "Hail" +
       NC + "\n\n\n");
  }


  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
  public static final String YLW = "\033[1;93m";
  public static final String NC = "\u001B[0m";
}


/*

Date nowAsDate =
  Date.from(
    LocalDate.now().
      atStartOfDay(ZoneId.systemDefault()).toInstant());

LocalDate currentDateLD =
nowAsDate.toInstant().
atZone(ZoneId.systemDefault()).
  toLocalDate();



LocalDate recentAttemptLD =
currentDateLD.minusDays(1);


Date niceTryAsDate =
Date.from(
recentAttemptLD.atStartOfDay().
  atZone(ZoneId.systemDefault()).
    toInstant());
≅

System.err.println(
"\n\n---------------------->>> \n" +
"\n   currentDateLocalDate  " + currentDateLD +
"\n recentAttemptLocalDate  " + recentAttemptLD +
"\n\n currentDateRepresentation  " + nowAsDate +
"\n attemptDateRepresentation  " + niceTryAsDate +
"\n\n<<<---------------------- \n");

*/
