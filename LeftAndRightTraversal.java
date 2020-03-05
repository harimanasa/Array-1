class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        //validate
        if(matrix==null || matrix.length==0) return result;
        
        //logic starts here
        int m=matrix.length, n=matrix[0].length;
        int i=0;
        int row=0, col=0, dir=1;
        while(i<m*n){
            System.out.println(matrix[row][col]);
            result.add(matrix[row][col]);
            if(dir==1){//right
                if(col==n-1){
                    row++;
                    dir=-1;
                }else{
                    col++;
                }
            }
            else{
                if(col==0){
                    row++;
                    dir=1;
                }else{
                    col--;
                }
            }
            i++;
        }
        return result;
    }
}
