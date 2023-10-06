package striver;

import java.util.ArrayList;

public class Twosum {

    public static void main(String[] args) {
        int []a={2,7,11,15};
        int k=9;
         
        ArrayList<Integer>total=new ArrayList<>();

        int sum=0;
    for (int i = 0; i < a.length; i++) {
            sum=a[i];

            for (int j = 1; j < a.length; j++) {
                sum+=a[j];
                if(sum==k){
                    total.add(i);
                    total.add(j);
                    break;
                }
                else{
                    sum-=a[j];

                }   
            }
            sum=0;   
    }
          

    // for(int it:total){
    //     System.out.print(it);
    // }

    System.out.println(total);
        
    
    }
    
}
