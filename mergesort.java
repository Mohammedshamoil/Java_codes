public class mergesort {
 

   static void merge_part(int []arr,int l,int mid,int r){

        int left=l;
        int right=mid+1 ;
         int k=0;
         int []b=new int[r-l+1];
        while(left<=mid && right<=r){
                if(arr[left]<arr[right]){
                     b[k]=arr[left];
                     left++;
                }
                else{
                    b[k]=arr[right];
                    right++;
                }
                k++;
        }
                while(right<=r){
                    b[k++]=arr[right++];
                }
                while(left<=mid){
                    b[k++]=arr[left++];
                }
            for(int i=0,j=l;i<b.length;i++,j++){
               arr[j]= b[i];
            }
    }





    // int a[]=new int[r-l+1];
    //    int low=l;
    //    int right=mid+1;
    //    int k=0;
    //    while(low<=mid && right<=r){
    //        if(arr[low]<arr[right]){
    //            a[k]=arr[low];
    //            low++;
    //        }
    //        else{
    //            a[k]=arr[right];
    //            right++;
    //        }
    //        k++;
    //    }

    //    while(low<=mid){
    //        a[k]=arr[low];
    //        k++;
    //        low++;
    //    }

       
    //    while(right<=r){
    //        a[k]=arr[right];
    //        k++;
    //        right++;
    //    }

    //    for (int i = 0,j=l; i < a.length;j++, i++) {

    //        arr[j]=a[i];
           
    //    }













    static void mergeSort(int arr[], int l,int r){

    if( l<r){
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge_part(arr,l,mid,r);
    }
 }
    //print 
      static void printArrays(int []arr){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }

     }
    public static void main(String[] args) {
        int []arr={3,4,2,1,5,8};
            int n=arr.length-1;
        mergeSort(arr,0,n);
        printArrays(arr);
    }

   
  
  
}

