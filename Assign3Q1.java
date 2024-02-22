public class Assign3Q1 {
    public static void main(String args[]) {

        // Vowels: a,e,i,o,u

        char someChar = 'a';

        System.out.println("Char is: " + someChar);

        switch (someChar) {
            case 'a':
                System.out.println("The alphabet " + someChar + " is a vowel");
                break;
            case 'e':
                System.out.println("The alphabet " + someChar + " is a vowel");
                break;
            case 'i':
                System.out.println("The alphabet " + someChar + " is a vowel");
                break;
            case 'o':
                System.out.println("The alphabet " + someChar + " is a vowel");
                break;
            case 'u':
                System.out.println("The alphabet " + someChar + " is a vowel");
                break;

            default:
                System.out.println("The alphabet " + someChar + " is not a vowel");
                break;
        }

    }
}
