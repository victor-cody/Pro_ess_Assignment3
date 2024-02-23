public class Assign3Q5 {
  public static void main(String args[]) {

    // Insert your code here!

    int index = 1, columns, rows = 6;

    while (index <= rows) {
      for (int whitespace = rows - index; whitespace >= 1; whitespace--) {
        System.out.print(" ");
      }
      for (columns = 1; columns <= index; columns++) {
        System.out.print(" " + index + " ");
        for (columns = 1; columns <= index; columns++) {
          System.out.print(index + " ");
        }
      }
      System.out.println();
      index++;
    }

  }
}
