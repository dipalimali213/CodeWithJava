import java.util.Scanner;
public class HalfPyramidNumberPattern {
    public static void halfPyramidPattern(int num){
        for(int i = 1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of lines of Pattern : ");
        int num = sc.nextInt();
        halfPyramidPattern(num);
    }
    
}
