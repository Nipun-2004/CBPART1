package lecture_7;
public class BinarySearch {
    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6,7,8,10,12,14};
        int num = 6;
        boolean found = BinarySearch(arr, num);
        System.out.println("Number Found: " + found);
    }

        static boolean BinarySearch(int[]arr , int num ){
            int low=0;
            int high = arr.length-1;
            while(low<=high){
                int mid = ( high+low)/2;
            if( arr[mid]==num)
            return true;
            else if (arr[mid]<num)
            low = mid+1;
            else 
            high = mid-1;
        }
         return false;
        

    }
}