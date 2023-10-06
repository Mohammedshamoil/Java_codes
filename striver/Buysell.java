
package striver;
public class Buysell {

    public static void main(String[] args) {
        int []a={7,1,5,4,3,7,6};

        int diff=0;
        for(int i=0;i<a.length;i++){

            for (int j = i+1; j < a.length; j++) {

                if(a[j]>a[i]){
                    diff=Math.max(a[j]-a[i], diff);
                }
                
            }
        }

        System.out.println(diff);
    }
    
}
