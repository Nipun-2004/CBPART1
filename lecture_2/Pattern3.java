package lecture_2;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a Number");
    int n =scanner.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
        System.err.print("* ");
    }System.out.println(" ");
    }
}
    
}
