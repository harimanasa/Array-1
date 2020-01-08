// Time Complexity : O(N) since each element is visited only once.
// Space Complexity : O(1) since output array does not count. No other auxiliary data structures utilized
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ArrayProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];

        //base case
        if(nums.length==0 || nums ==null){ return result; }

        //initialization
        int temp=1, runningProduct =1;

        /* Cycle1: If the given array is {a,b,c,d} This gives result{1,a,ab,abc}*/
        for(int i=0; i<nums.length; i++){ //cycle 1
            runningProduct*=temp;
            result[i] = runningProduct;
            temp = nums[i];
        }

        temp=1; runningProduct =1; //reset
        /* Cycle2: If the given array is {a,b,c,d} This gives result{1*bcd,a*cd,ab*d,abc*1}*/
        for(int i=nums.length-1; i>=0; i--){ //cycle 2
            runningProduct*=temp;
            result[i] *= runningProduct;
            temp = nums[i];
        }
        return result; //This will be {bcd, acd, abd, abc}
    }
}
