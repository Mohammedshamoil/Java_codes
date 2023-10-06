public class anagram {



    
    public static void main(String[] args) {
        String s1="shammw";
        String s2="hammus";
        int []b= new int[26];
        if(s1.length()!=s2.length()){
            System.out.println("not a anagram");
            

        }


        else{
            for(int i=0;i<s1.length();i++){

                b[s1.charAt(i)-'a']++;
                b[s2.charAt(i)-'a']--;

            }
        
        int f=1;
        for(int i=0;i<26;i++){
            if(b[i]>0){
                f=0;

            }
        }

        if(f==1){
            System.out.println("yes");
        }
        else{

            System.out.println("no");
        }
    }

    }
    
}
