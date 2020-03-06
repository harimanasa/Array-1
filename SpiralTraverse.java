//Time: O(n)
//Space : O(1)
//Ran on LeetCode
//No issues

class Solution {
    List<Integer> result=new LinkedList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        //validate
        if(matrix==null || matrix.length==0) return result;
        
        //logic starts here
        int m=matrix.length, n=matrix[0].length;
    
        helper(matrix, 0, m-1, 0, n-1);
        return result;
    }
    
    private void helper(int[][] matrix, int top, int bottom, int left, int right){
        if(left > right || top > bottom) return;
        
        for(int i=left; i<=right; i++){
            result.add(matrix[top][i]);
        }
        top++;
        
        for(int i=top; i<=bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        } 
        helper(matrix, top, bottom, left, right);
    }
}
