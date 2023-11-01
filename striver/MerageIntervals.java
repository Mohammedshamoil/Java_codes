package striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MerageIntervals {


     public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr){
                Arrays.sort(arr, new Comparator<int[] >() {
                    public int compare(int[] a,int[] b){
                        return a[0]-b[0];
                    }
                    
                });




                List<List<Integer>> ans=new ArrayList<>();


                int start=arr[0][0];
                int end=arr[0][1];

                for (int i = 0; i < arr.length; i++) {
                    
                    if(arr[i][0]>end){
              
                        ans.add(Arrays.asList(start,end));
                    start=arr[i][0];
                    end=arr[i][1];
    
                }
                else{
                      start=Math.min(start,arr[i][0]);
                    end=Math.max(end,arr[i][1]);
                
                }
                }
                 ans.add(Arrays.asList(start,end));
                return ans;

    }
    public static void main(String[] args) {
         int[][] arr = {{1, 3}, {2, 6}, {8, 9},{9,11},{8,10},{2,4}, {15, 18},{16,17}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);


        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
    
}
