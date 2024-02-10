public class Assign2Q2B {
    public static void main(String args[]) {
      int firstNumber = 1;
      int answer = 0;
      
      for (int secondNumber = 10; secondNumber>0; secondNumber--)
       {
        answer = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);   
       }

    }
}
