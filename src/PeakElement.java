import java.util.ArrayList;

//1) If input array is sorted in strictly increasing order, the last element is always a peak element.
//For example, 5 is peak element in {1, 2, 3, 4, 5}.
//2) If input array is sorted in strictly decreasing order, the first element is always a peak element.
//10 is the peak element in {10, 9, 8, 7, 6}.
public class PeakElement {
    public int solve(ArrayList<Integer> a) {
        int low=0;
        int high=a.size()-1;
        int mid=0;
        int result=0;
        while(low<=high){
            mid=low+((high-low)/2);
            if((mid==a.size()-1||a.get(mid)>a.get(mid+1)) && (mid==0||a.get(mid)>=a.get(mid-1))){
                break;
            }
            else if(a.get(mid)>a.get(mid+1)&&mid>0){high=mid-1;}
            else{low=mid+1;}
        }
        return a.get(mid);
    }
}
