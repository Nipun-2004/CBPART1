package lecture_2;
import  java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=0;k<=2*(n-i+1);k++)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            System.err.print("* ");}
        System.out.println();
        }
        sc.close();
}
}