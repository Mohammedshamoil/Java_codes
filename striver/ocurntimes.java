package striver;
public class ocurntimes {


    public static void main(String[] args) {
    int []a={1,2,1,1,1,4,2};
    int  n=a.length;
    int len=0;
    int flag=0;
    for (int i = 0; i < a.length; i++) {

        for (int j = 0; j < a.length; j++) {
            if(a[i]==a[j]){
                len++;
            }
            
        }

        if(len>n/2){
            flag=1;
            System.out.println(a[i]);
            break;
        }
        len=0;
        


        
    }
    if(flag==0) {System.out.println("not found");}
    }
    
}
