//Time : O(n)
//Space : O(1) since output array is not considered extra
//Leetcode: Yes
//No issue


class Solution {
    public int[] productExceptSelf(int[] nums) {
        //validate
        if(nums==null || nums.length==0) return nums;
        
        
        //logic
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){ans[i]=1;} //initialization
        //System.out.println(Arrays.toString(ans));
        
        int temp=1;
        for(int i=0; i<nums.length; i++){
            ans[i] *= temp;
            temp *= nums[i];
        }
        temp=1;
        for(int i=nums.length-1; i>=0; i--){
            ans[i] *= temp;
            temp *= nums[i];
        }
        
        // System.out.println(Arrays.toString(ans));
        return ans;
    }
}
