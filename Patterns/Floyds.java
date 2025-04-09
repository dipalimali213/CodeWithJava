import java.util.Scanner;
public class Floyds {
    public static void floydsPattern(int num){
        int counter = 1;
        for(int i = 1;i<=num ; i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of lines : ");
        int num = sc.nextInt();
        floydsPattern(num);
    }
}
