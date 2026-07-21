package Leetcode;

public class SetMatrixZeros {

    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    markRows(matrix,rows,cols,i);
                    markCols(matrix,rows,cols,j);
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j]=0;
                }
            }
        }


    }
    public static void markRows(int[][] matrix,int rows,int cols,int i){
        for(int j=0;j<cols;j++){
            if(matrix[i][j] !=0){
                matrix[i][j]=-1;
            }
        }
    }
    public void markCols(int[][] matrix,int rows,int cols,int j){
        for(int i=0;i<rows;i++){
            if(matrix[i][j] !=0){
                matrix[i][j]=-1;
            }
        }
    }


}