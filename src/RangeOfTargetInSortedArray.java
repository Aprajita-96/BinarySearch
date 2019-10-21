import java.util.ArrayList;
import java.util.List;

public class RangeOfTargetInSortedArray {
    // DO NOT MODIFY THE LIST
    public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> result=new ArrayList<Integer>(2);
        int low=0;
        int high=a.size()-1;
        int first=firstIndex(a,low,high,b);
        int last=lastIndex(a,low,high,b);
        result.add(first);
        result.add(last);
        return result;
    }
    public static int firstIndex(List<Integer> a,int low,int high,int key){
        //calculate the first index
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if((mid==0||a.get(mid-1)<key) &&(a.get(mid)==key)){return mid;}
            if(a.get(mid)<key){low=mid+1;}
            else {high=mid-1;}
        }
        return -1;
    }
    public static int lastIndex(List<Integer> b,int low,int high,int key){
        //calculate the last index
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if((mid==b.size()-1|| b.get(mid+1)>key) && (b.get(mid)==key)){return mid;}
            if(b.get(mid)>key){ high=mid-1;}
            else{ low=mid+1;}
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr =  {106, 106, 248, 248, 248, 248, 248, 357, 357,890,890 };
        List<Integer> result=new ArrayList<>();
        for(int i:arr){
            result.add(i);
        }
        System.out.println(searchRange(result,248));
    }
}


