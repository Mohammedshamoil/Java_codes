public class quicksort {



    static void swaps(int []arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

  static int parition(int [] arr,int l,int r){
    int pivot=arr[l];
    int low=l;
    int high=r;

    while(low<high){ 
    while(arr[low]<=pivot){low++; }
    while(arr[high]>pivot){high--;}
    if(low<high){swaps(arr,low, high);}
    
    }

    swaps(arr,l,high);
 
    return high;
 
 }
    static void Quicksort(int []arr,int l,int r){
        if(l<r){
            int pivot=parition(arr,l,r);
            Quicksort(arr,l,pivot-1);
             Quicksort(arr,pivot+1,r);
            

        }
    }

    static void printArrays(int []arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
  
       }
    public static void main(String[] args) {
        int []arr={11,22,33,4,4,5,1,3,456,77,88,22,567,432,11,346,678,990,887,43,908,766,554,32,567,899,77,6,543,45};
            int n=arr.length-1;
        Quicksort(arr,0,n);
        printArrays(arr);
    }
    
}

// 526,112,581,450,533,346,94,454,302,847,31,76,703,400,208,889,355, 484 ,966 ,330,851,847,845,606,614,825 
