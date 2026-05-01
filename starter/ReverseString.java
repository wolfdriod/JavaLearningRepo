/*
 * Question: Write a Java program to reverse a given String. (A very common interview question for automation).
 *
 * Input: "Automation"
 * Output: "noitamotuA"
 */
public class ReverseString {
    public static void main(String[] args) {
        String original = "Automation";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
