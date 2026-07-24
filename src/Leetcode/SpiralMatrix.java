package Leetcode;
import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,bottom=n-1,left=0,right=m-1;
        List<Integer> a=new ArrayList<>();
        while (top <= bottom && left <= right) {
            for(int i=left;i<=right;i++){
                a.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left++;
            }
        }
        return a;

    }
}