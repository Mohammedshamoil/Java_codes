import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void reverArray(int a[],int start,int end)
	{
		while (start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;

			
		}
	}

	public static void rotate(int a[],int n,int k){
		int d=k;
		if(k>n){
			d=k%n;
		}
		reverArray(a,0,d-1);
		reverArray(a,d,n-1);
		reverArray(a,0,n-1);

	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];

		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			
		}
         
		int k=sc.nextInt();

		rotate(arr,n,k);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");
			
			
		}

		
	}
}
