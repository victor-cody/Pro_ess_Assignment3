public class Assign3Q2 {
  public static void main(String args[]) {
    boolean isLeapYear = true;
    String currentMonth = "January";

    System.out.println("The current month is: " + currentMonth);

    // Insert your code here!

    switch (currentMonth) {
      case "January":
        System.out.println(currentMonth + " has 31 day");
        break;
      case "February":
        if (isLeapYear) {
          System.out.println(currentMonth + " has 29 day");
        } else {
          System.out.println(currentMonth + " has 28 day");
        }
        break;
      case "March":
        System.out.println(currentMonth + " has 31 day");
        break;
      case "April":
        System.out.println(currentMonth + " has 30 day");
        break;
      case "May":
        System.out.println(currentMonth + " has 31 day");
        break;
      case "June":
        System.out.println(currentMonth + " has 30 day");
        break;
      case "July":
        System.out.println(currentMonth + " has 31 day");
        break;
      case "August":
        System.out.println(currentMonth + " has 1 day");
        break;
      case "September":
        System.out.println(currentMonth + " has 30 day");
        break;
      case "October":
        System.out.println(currentMonth + " has 31 day");
        break;
      case "November":
        System.out.println(currentMonth + " has 30 day");
        break;
      case "December":
        System.out.println(currentMonth + " has 31 day");
        break;

      default:
        break;
    }

  }
}
