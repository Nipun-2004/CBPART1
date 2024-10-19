package lecture_2;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter a Number");
     int n =scanner.nextInt();
     for(int i=1;i<=n;i++){
        for(int k=1;k<=(n-i);k++)
        System.out.print("  ");
        for(int j=1;j<=i;j++)
        System.err.print("* ");
    System.out.println();
    }
    scanner.close();
}
}
