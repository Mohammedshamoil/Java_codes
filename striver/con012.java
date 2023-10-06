package striver;

public class con012 {
    public static void main(String[] args) {
        int []a={1,0,2,1,0,2,1,0,0,1};
        int i=0;
        int cnt0=0,cnt1=0,cnt2=0;
        System.out.println("orginal");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+ " ");
            
        }
        while (i<a.length) {
            if(a[i]==0){
                cnt0++;
            }
            else if(a[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
            i++;
            
        }

        System.out.println(cnt0+" zero");
           System.out.println(cnt1+" one");
              System.out.println(cnt2+" two");


        for(int j=0;j<cnt0;j++){
            a[j]=0;

        }
        
        for(int j=cnt0;j<cnt0+cnt1;j++){
            a[j]=1;

        }

        
        for(int j=cnt0+cnt1;j<a.length;j++){
            a[j]=2;

        }

          System.out.println("replace");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+ " ");
            
        }

    }
}
