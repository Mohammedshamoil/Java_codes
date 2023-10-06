class leetcodeRotate{


    public static void Rotatetoright(int arr[],int n,int k){
        int d=k;
        if(k>n){

             d=k%n;
        }
        int []temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];


        }



        for(int j=d;j<n;j++){
            arr[j-d]=arr[j];
        }



        //stroing temp values in actual arrray
            int l=0;
        for(int h=n-d;h<n;h++){
            arr[h]=temp[l++];

        }
        
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 9;
        Rotatetoright(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
        }
        
    }
}