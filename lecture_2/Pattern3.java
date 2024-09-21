package lecture_2;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a Number");
    int n =scanner.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
        System.err.print("* ");
    }System.out.println();
    }
}
    
}
