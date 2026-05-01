import java.util.Random;

/*
 * Question: Write a Java program to generate a random number within a specific range (e.g., 1 to 100).
 *
 * Input: Range 1 to 100
 * Output: Random Number: 42 (Example)
 */
public class GenerateRandomNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;

        // Approach 1: Using Math.random()
        int randomWithMath = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random Number (Math.random): " + randomWithMath);

        // Approach 2: Using Random class
        Random random = new Random();
        int randomWithClass = random.nextInt(max - min + 1) + min;
        System.out.println("Random Number (Random Class): " + randomWithClass);
    }
}
