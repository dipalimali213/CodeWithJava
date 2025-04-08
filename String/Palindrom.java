import java.util.*;

public class Palindrom {
    // Method to check if the string is a palindrome
    public static boolean palindromString(String str) {
        int n = str.length(); // Save the length once
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        if (palindromString(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
        
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)