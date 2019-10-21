import java.util.ArrayList;
import java.util.List;

public class ArrangeAggressiveCows {
    public static int placeCow(int distance, int cow, ArrayList<Integer> stalls){
        int lastplaced=stalls.get(0);
        int cowsPlaced=1;
        for(int i=1;i<=stalls.size()-1;i++){
            System.out.println(stalls.get(i));
            System.out.println( stalls.get(i)-lastplaced);
                if((stalls.get(i))-((lastplaced))>=distance){
                    cowsPlaced++;
                    System.out.println(stalls.get(i));
                    lastplaced=stalls.get(i);
                    if(cowsPlaced==cow){
                        return 1;
                    }
                }
        }
        if(cow==0){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args)
    {
        int[] arr =  {1,2,3,4,5,};
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:arr){
            result.add(i);
        }
        System.out.println(placeCow(2,3,result));
    }
}
