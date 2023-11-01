package striver;

public class subArraysinXor {

    public static void main(String[] args) {
        
        int[] a={4,2,2,6,4};
        int k=6;
        int cnt=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int xor=0;
              for (int j2 = i; j2 <=j; j2++) {

                    xor=xor^a[j2];
                    
                }
                if(xor==k){
                    cnt++;
                }
    
            }
        }
        System.out.println(cnt);
    }
    
}
