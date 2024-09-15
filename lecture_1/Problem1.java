// If the input is N , check whether the number N is prime or not 
package lecture_1;
import java.util.Scanner;
public class Problem1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n =sc.nextInt();
    boolean b = true;
    for (int i=2;i<n;i++)
        if(n%i==0){
            b= false;
            break;
         }
    if (b==true){
    System.out.println( n + "is prime" );
}else{
    System.out.println( n + "is not prime");
}
    
    sc.close();

}
}