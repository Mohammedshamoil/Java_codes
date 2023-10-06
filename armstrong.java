import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int t=n;
        int temp=n;
        while(n!=0){
    
            n=n/10;
            count++;
        }

    double sum=0;
        while(t!=0){
            int rem=t%10;
             sum=Math.pow(rem,count)+sum;
             t=t/10;
        }

        if(sum==temp){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
