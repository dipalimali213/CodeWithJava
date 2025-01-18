import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int binaryno) {
        int pow = 0;
        int dec = 0;
        while (binaryno > 0) {
            int last_digit = binaryno % 10;
            dec += last_digit * (int) Math.pow(2, pow);
            pow++;
            binaryno /= 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        int binaryno = sc.nextInt();
        System.out.println("Decimal Equivalent : " + binaryToDecimal(binaryno));
        sc.close();
    }
}
