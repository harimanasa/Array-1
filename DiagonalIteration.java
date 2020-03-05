//Time: O(m*n)
//Space: O(1) since result space is not counted. Please confirm on this if I'm wrong.
//Leetcode: Yes
//No issue

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //validate
        if(matrix==null || matrix.length==0){return new int[]{};}
        
        //logic starts here
        int m=matrix.length;
        int n=matrix[0].length;
        int[] result = new int[m*n];
        
        int dir=1;
        int i=0;
        int row=0, col=0;
        while(i<m*n){ //The safe while condition
            //Up
            System.out.println(matrix[row][col]);
            result[i] = matrix[row][col];
            if(dir==1){
                if(col==n-1){
                    row++;
                    dir=-1;
                }
                else if(row==0){
                    col++;
                    dir=-1;
                } else{
                    row--;
                    col++;
                }
            }
            //Down
            else{
                if(row==m-1){
                    col++;
                    dir=1;
                }else if(col==0){
                    row++;
                    dir=1;
                }
                else{
                    row++;
                    col--;
                } 
            }
            i++;
        }
       return result; 
    }
}
