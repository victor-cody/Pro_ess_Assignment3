public class Assign3Q5 {
  public static void main(String args[]) {

    // Insert your code here!
    int rows = 6;

    for (int index = 1; index <= rows; index++) {
      for (int whitespace = rows - index - 1; whitespace >= 1; whitespace--) {
        System.out.print(" ");
      }
      for (int symbolToPrint = 0; symbolToPrint <= index; symbolToPrint++) {
        System.out.print(symbolToPrint + " ");
      }

      System.out.println();
    }

    // for (i = 1; i <= rows; i++) {
    // for (j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
  }
}
