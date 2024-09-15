package lecture_1;
import java.util.Scanner;

public class Whileloop { 
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =scanner.nextInt();
        int i=1;
        while(i<=n){ 
            System.out.println(i);
            i++;
        }
    }
    

    
}
