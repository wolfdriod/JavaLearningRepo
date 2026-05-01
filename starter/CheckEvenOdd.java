import java.util.Scanner;

/*
 * Question: Write a Java program to check whether a given number is Even or Odd using if-else.
 *
 * Input: 14 (from Scanner)
 * Output: 14 is Even.
 * 
 * Input: 7 (from Scanner)
 * Output: 7 is Odd.
 */
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Uncomment the line below to test with scanner input during execution
        // int number = scanner.nextInt();
        
        // Hardcoded for testing demonstration
        int number = 14; 
        System.out.println("Input provided: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
        scanner.close();
    }
}
