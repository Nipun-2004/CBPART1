package lecture_10;

public class parenthesis {
    static int count =0;
    static void generateParenthesis(int n , int l , int r , String ans){
        if(n==l && l==r){
        //System.out.println(ans);
        count++;
        return;
    }
    if( l>n || r>l)
        return;
    generateParenthesis( n , l+1 , r , ans+"{");
    generateParenthesis( n, l , r+1, ans+"}");
}
public static void main(String[] args) {
    generateParenthesis(10, 0, 0, "");
    System.out.println(count);
    }
}