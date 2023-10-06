public class set1 {
    public static void main(String[] args) {
        int s=f(2,1);
        System.out.println(s);
       
    }


   static  int f(int a,int b){
        if((5-a)>(a-b)&& b<a){
            a=(a+1)+a;
            b=b+2;
            b=2+a+b;
            return b-f(b+1,b)+1;
        }
        return a;
    }
    
}



