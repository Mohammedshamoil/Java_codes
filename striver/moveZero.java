package striver;

public class moveZero {


    public static void movezero(int arr[]){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cnt++;
            }
        }

        System.out.println("zero count = "+cnt);



        int []temp=new int[n];
        int j=0;
                for(int i=0;i<n;i++){
                    if(arr[i]!=0){
                        temp[j]=arr[i];
                        j++;
                    }
                }
             for(int k=j;k<n;k++){
               
                    temp[k]=0;
                    
                

             }


             for(int l=0;l<temp.length;l++){
                arr[l]=temp[l];
             }

    }

    public static void main(String[] args) {
        int []arr={44,0,0,1,0,0,3};


        movezero(arr);


         for(int l=0;l<arr.length;l++){
                System.err.print(arr[l]+" ");
             }
    }
    
}
