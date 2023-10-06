package striver;

public class Msubarray {

    public static void main(String[] args) {
        int []a={3,1,2,4};
        int d=6;
        int cnt=0;
        for(int i=0;i<a.length;i++){
             
            
            for(int j=i;j<a.length;j++){
                     int sum=0;
                    for(int k=i;k<=j;k++){
                        sum+=a[k];

                    }
                    if(sum==d){
                        cnt++;
                    }
            }

        }


        System.out.println(cnt);
    }
    
}
