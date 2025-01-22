import java.util.Scanner;

public class LCMOfNumber {
    public static int lcmOfNumber(int num1, int num2) {
        int i = 1;
        while (i <= (num2)) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor; // Return the LCM once found
            }
            i++;
        }
        return -1; // Return -1 if no LCM is found (should never reach here logically)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter two numbers to find their LCM:");
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        // Call the lcmOfNumber method and display the result
        int lcm = lcmOfNumber(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close(); // Close the scanner
    }
}
