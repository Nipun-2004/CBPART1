package lecture_3;
import java.util.Scanner;
public class Armstrong {
static boolean armstrong(int n){
int temp= n;
int len= 0;
while (temp != 0) {
    temp/= 10;
    len++;
}
int sum=0;
temp=n;
while(temp!=0){
    sum+=(int)Math.pow(temp%10,len);
temp/=10;
}
return(sum==n);
}
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a Number");
    int n =scanner.nextInt();
    System.out.println(armstrong(n));
    int[] arr= new int[5];
    arr[0]=30;
    arr[1]=10;
    arr[2]=40;
    arr[3]=80;
    arr[4]=70;
    System.out.println(arr[3]);
    scanner.close();
} 

}    