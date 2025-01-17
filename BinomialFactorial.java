import java.util.Scanner;

public class BinomialFactorial {
    // Method to calculate the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Method to calculate the binomial coefficient using factorials
    public static int binomialFactorial(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binomialCoefficient = fact_n / (fact_r * fact_nmr);
        return binomialCoefficient;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        System.out.print("Enter a value for r: ");
        int r = sc.nextInt();

        // Ensure r is not greater than n
        if (r > n) {
            System.out.println("r should not be greater than n. Please enter valid values.");
        } else {
            int result = binomialFactorial(n, r);
            System.out.println("The binomial coefficient is: " + result);
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
