public class Assign3Q6 {
  public static void main(String args[]) {

    // Insert your code here!
    int index = 1, columns, rows = 6;

    do {
      int whitespace = rows - index;
      do {
        System.out.print(" ");
        whitespace--;
      } while (whitespace >= 1);

      columns = 1;
      do {
        System.out.print(" " + index + " ");
        columns++;
      } while (columns <= index);

      columns = 1;
      do {
        System.out.print(index + " ");
        columns++;
      } while (columns <= index);

      System.out.println();
      index++;
    } while (index <= rows);
  }
}
