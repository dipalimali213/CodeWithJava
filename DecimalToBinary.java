import java.util.Scanner;

public class DecimalToBinary {
    public static int decimalToBinary(int decimalno) {
        int pow = 0;
        int binary = 0;
        while (decimalno > 0) {
            int rem = decimalno % 2; 
            binary += rem * (int) Math.pow(10, pow); 
            pow++;
            decimalno /= 2; 
        }
        return binary; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int decimalno = sc.nextInt(); // Correct variable name
        System.out.print("Binary Equivalent: " + decimalToBinary(decimalno));
        sc.close(); // Close the scanner
    }
}
