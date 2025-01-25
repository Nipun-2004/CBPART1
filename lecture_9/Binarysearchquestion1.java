package lecture_9;public class Binarysearchquestion1 {
   static boolean check(int speed, int dist,int time){
        int dis_travelled = speed*time ;
        return(dis_travelled>=dist);
    } 
    static int reach_center(int time, int dist){
        int low=0 ; int high = 20000000;
        int ans=-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(check(mid, dist, time)){
                ans=mid;
                high= mid-1;
            }else
                low= mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reach_center(1, 4));
    }
}


