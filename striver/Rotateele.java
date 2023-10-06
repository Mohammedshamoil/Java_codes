package striver;
public class Rotateele {


    static void rotate(int matrix[][],int n,int m){
        int row=0;
        int col=0;
        int lastrow=n;
        int lastcol=m;
        int cur=0;
        int prev=0;
        while(row<lastrow&& col<lastcol){
             prev=matrix[row+1][col];
            for(int j=col;j<lastcol;j++){
                 cur=matrix[row][j];
                matrix[row][j]=prev;
                prev=cur;

            }

            row++;
            for(int i=row;i<lastrow;i++){
                cur=matrix[i][lastcol-1];
                matrix[i][lastcol-1]=prev;
                prev=cur;
                
            }
            lastcol--;
            if(row<lastrow){
                for(int j=lastcol-1;j>=col;j--){
                    cur=matrix[lastrow-1][j];
                    matrix[lastrow-1][j]=prev;
                    prev=cur;
                }
            }
            lastrow--;
            if(col<lastcol){
                for(int i=lastrow-1;i>=row;i--){
                    cur=matrix[i][col];
                    matrix[i][col]=prev;
                    prev=cur;
                }
            }
            col++;

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=matrix.length;
        int m=matrix[0].length;

        rotate(matrix,n,m);
    }
    
}
