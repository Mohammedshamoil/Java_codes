package striver;
public class zeromatrix {

   static void matrow(int matrix[][],int row,int col,int i){
      for (int j = 0; j < col; j++) {

        if(matrix[i][j]!=0){
            matrix[i][j]=-1;

        }
        
      }
   }
     static void matcol(int matrix[][],int row,int col,int j){
      for (int i = 0; i < row; i++) {

        if(matrix[i][j]!=0){
            matrix[i][j]=-1;

        }
        
      }
   }


    public static int[][]zero(int matrix[][],int row,int col){


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if(matrix[i][j]==0){
                    matrow(matrix,row,col,i);
                    matcol(matrix,row,col,j);
                }
                
            }
            
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                   
                }
                
            }
            
        }




        return matrix;

    }
    public static void main(String[] args) {
        // int matrix[][]=new int[3][3];
        

         int matrix[][] = { {1,0,1},{1,1,1},{0,1,1} };


        int row=matrix.length;
        int col=matrix[0].length;

        
      int matrix1[][]=zero(matrix,row,col);

      for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

               System.out.print(matrix1[i][j]+" ");
                
                
            }
            System.out.println();
            
        }


    }
    
}
