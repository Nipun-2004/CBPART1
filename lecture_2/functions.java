package lecture_2;
public class functions {
static void printsquare(int n){
    n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
        System.err.print("* ");
    }System.out.println();
    
    }
} 
static void printRFT(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.err.print("* ");
    }System.out.println();
    }
}
static void printINVRFT(int n){
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
        System.err.print("* ");
    }System.out.println(" ");
    }
}
static void printLFT(int n){
    
    for(int i=1;i<=n;i++){
        for(int k=1;k<=(n-i);k++)
        System.out.print("  ");
        for(int j=1;j<=i;j++)
        System.err.print("* ");
    System.out.println();
    }
}
static void printINVLFT(int n){
    for(int i=n;i>=1;i--){
        for(int k=1;k<=(n-i);k++)
        System.out.print("  ");
        for(int j=1;j<=i;j++)
        System.err.print("* ");
    System.out.println();
    }
}
public static void main(String[] args) {
    int n=4;
    System.out.println("Square");
    printsquare(n);
    System.out.println("Right Facing Triangle");
    printRFT(n);
    System.out.println(" Inverted Right Facing Triangle");
    printINVRFT(n);
    System.out.println("Left Facing Triangle");
    printLFT(n);
    System.out.println("INverted Left Facing Triangle");
    printINVLFT(n);
}
}
