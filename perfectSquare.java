import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int t=n;
            int sum=0;

            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    sum+=i;
                    
                }

            }

            if(sum==t)
            {
                System.out.println("yes");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
