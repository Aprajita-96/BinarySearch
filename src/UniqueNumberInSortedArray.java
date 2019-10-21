import java.util.ArrayList;

public class UniqueNumberInSortedArray {
        public static int solve(ArrayList<Integer> A) {
            int low=0;
            int high=A.size()-1;
            while(low<=high){
                int mid=low+ (high-low)/2;
                if(low==high){return A.get(high);}
                if(mid%2==0){
                    int midi=(mid+1);
                    if(A.get(mid).equals(A.get(mid+1))) {
                        low=mid+2;
                    }
                    else {
                        high=mid;
                    }

                }
                else{
                    if(A.get(mid).equals(A.get(mid-1))){low=mid+1;}
                    else {high=mid;}
                }
            }
            return -1;
        }
    public static void main(String[] args)
    {
        int[] arr =  {106, 106, 248, 248, 286, 286, 344, 357, 357 };
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:arr){
            result.add(i);
        }
        System.out.println(solve(result));
    }
}



