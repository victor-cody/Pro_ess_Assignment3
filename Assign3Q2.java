public class Assign3Q2 {
  public static void main(String args[]) {
    boolean isLeapYear = true;
    String currentMonth = "June";

    System.out.println("The current month is: " + currentMonth);

    // Insert your code here!

    switch (currentMonth) {
      case "January":
        System.out.println(currentMonth + " has 31 days");
        break;
      case "February":
        if (isLeapYear) {
          System.out.println(currentMonth + " has 29 days");
        } else {
          System.out.println(currentMonth + " has 28 days");
        }
        break;
      case "March":
        System.out.println(currentMonth + " has 31 days");
        break;
      case "April":
        System.out.println(currentMonth + " has 30 days");
        break;
      case "May":
        System.out.println(currentMonth + " has 31 days");
        break;
      case "June":
        System.out.println(currentMonth + " has 30 days");
        break;
      case "July":
        System.out.println(currentMonth + " has 31 days");
        break;
      case "August":
        System.out.println(currentMonth + " has 1 days");
        break;
      case "September":
        System.out.println(currentMonth + " has 30 days");
        break;
      case "October":
        System.out.println(currentMonth + " has 31 days");
        break;
      case "November":
        System.out.println(currentMonth + " has 30 days");
        break;
      case "December":
        System.out.println(currentMonth + " has 31 days");
        break;

      default:
        System.out.println("Invalid, this is not a month in the calender");
        break;
    }

  }
}
