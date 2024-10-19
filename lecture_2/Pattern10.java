package lecture_2;
import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            //for printing spaces
            for(int k=1; k<=(n-i);k++)
                System.out.print("  ");
            //For printing stars
            for(int j=1;j<=i;j++)
                System.out.print("* ");

            // For RFT
            for(int j=2;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close();
}
}