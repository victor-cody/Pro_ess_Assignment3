public class Assign3Q3 {
  public static void main(String args[]) {
    int currentValue = 10;
    int factorial = 1;

    System.out.println("The number is: " + currentValue);

    // Insert your code here!
    for (int i = 1; i <= currentValue; i++) {
      factorial = factorial * i;
    }
    ;

    System.out.println("The factorial of " + currentValue + " is : " + factorial);
  }
}
