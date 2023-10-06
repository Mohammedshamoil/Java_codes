import java.util.Scanner;

public class palindrome {
  
    public static void main(String[] args) {
       /*
          int a=221;
        
        int t=a;
        int sum=0;
        while(a!=0){
            int r=a%10;
            sum=(sum*10)+r;
            a=a/10;

        }

        if(t==sum){
            System.out.println("pali");
        }
        else{
            System.out.println("not pali");
            
        } */

        Scanner sc=new Scanner(System.in);
       
        System.out.println("start from 11 to ... =");
         int start=sc.nextInt();

        System.out.println("end =");
         int end=sc.nextInt();
         sc.close();

         for(int a=start;a<end;a++){
                int temp=a;
                int sum=0;

            while(temp>0){
                 int r=temp%10;
                  sum=(sum*10)+r;
                  temp=temp/10;
                
            }

            if(a==sum){
                System.out.println(a);
            }
            
         }
















       
  }

     
    
}
