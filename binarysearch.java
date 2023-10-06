public class binarysearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int high=a.length-1;
        int key=5;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(key==a[mid]){
                System.out.println("key is found at index "+mid);
                break;
            }

            else if(key<a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       
    }
}
