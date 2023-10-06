public class selectionsort {
    
 
    public static void main(String[] args) {
        int []arr={4,3,5,2,7};
    
        for(int i=0;i<arr.length;i++){

           int  current=i;
           for(int j=i+1;j<arr.length-1;j++){
                 if(arr[current]>arr[j]){
                     current=j;
                 }
           }
           swaps(arr,current,i);
        }
         for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
            }
       
    }

      static void swaps(int arr[],int current,int t){
            int s=arr[current];
            arr[current]=arr[t];
            arr[t]=s;
        }
           

    
}
