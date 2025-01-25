package lecture_10;
public class recursion7{
    static void  coinToss(int n , String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinToss(n-1, ans+"H");
        coinToss(n-1, ans+"T");
    }
    static int countSubSeq(String ques , String ans){
        if( ques.length()==0){ 
            return 1; }
            char a = ques.charAt(0);
            //include
            int inc = countSubSeq(ques.substring(1), ans+a);
            //don't include 
            int Ninc = countSubSeq(ques.substring(1), ans);
            return inc + Ninc ;}

    public static void main(String[] args) {
        String s= "3";
        System.out.println(countSubSeq(s, ""));
    }
}