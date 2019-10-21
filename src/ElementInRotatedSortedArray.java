import java.util.ArrayList;
import java.util.List;

public class ElementInRotatedSortedArray {
    public static int search(final List<Integer> a, int b) {
        int low=0;
        int high=a.size()-1;
        int pivot=0;
        pivot=indexOfpivot(a,low,high);
        if(pivot==-1){ return binarySearch(a,0,high,b); }
        if(a.get(pivot)==b){ return pivot; }
        if(a.get(0)<b){ return binarySearch(a,0,pivot-1,b); }
        else {return binarySearch(a,pivot+1,high,b);}
    }
    public static int binarySearch(List<Integer> a,int low,int high, int key){
        //apply binary search on a reduced search space
        int mid=0;
        while(low<=high){
            mid=low+((high-low)/2);
            if(a.get(mid).equals(key)){return mid;}
            else if(a.get(mid)<key){low=mid+1;}
            else {high=mid-1;}
        }
        return -1;
    }
    public static int indexOfpivot(List<Integer> a,int low,int high){
        //find the element which has a property of both the sides of it being sorted
        int mid=0;
        while(low<=high){
            mid=low+ (high-low)/2;
            if(a.get(mid)>a.get(mid+1)&& a.get(mid)>a.get(mid-1)){
            return mid;
            }
            else if(a.get(mid)>a.get(high)){low=mid+1;
                continue;
            }
            else{high=mid-1;}
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {194, 195, 196, 197, 198, 199, 201, 203, 204, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 39, 40, 42, 43, 44, 45, 47, 48, 49, 50, 51, 52, 53, 54, 55, 57, 58, 59, 60, 61, 63, 65, 66, 68, 69, 70, 71, 73, 74, 76, 77, 79, 80, 81, 82, 83, 84, 86, 87, 88, 89, 91, 92, 93, 94, 95, 97, 98, 99, 101, 103, 104, 105, 106, 107, 108, 109, 110, 113, 114, 115, 117, 118, 120, 121, 122, 123, 124, 127, 128, 130, 131, 133, 134, 135, 136, 137, 139, 140, 141, 142, 143, 144, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 158, 159, 160, 161, 162, 163, 164, 166, 167, 169, 170, 171, 172, 174, 175, 177, 178, 179, 181, 182, 184, 185, 187, 189, 190, 192, 193};
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:arr){
            result.add(i);
        }
        System.out.println(search(result,1));
    }

}
