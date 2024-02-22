public class Assign3Q4 {
  public static void main(String args[]) {

    // Insert your code here!
    int rows = 6;

    for (int index = 0; index < rows; index++) {
      for (int whitespace = rows - index - 1; whitespace >= 1; whitespace--) {
        System.out.print(" ");
      }
      for (int symbolToPrint = 0; symbolToPrint <= index; symbolToPrint++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
