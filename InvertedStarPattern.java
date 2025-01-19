import java.util.Scanner;
public class InvertedStarPattern {
    public static void InvertedStarpattern(int line){
        for(int i =0;i<line;i++){
            for(int j = 0;j<line-i;j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of Lines to print Pattern : ");
        int line = sc.nextInt();
        InvertedStarpattern(line);
    }
}
