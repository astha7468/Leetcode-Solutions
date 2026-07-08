class Solution {
    public int[] runningSum(int[] nums) {
       int n = nums.length;
       int[]runningsum = new int[n];
       
         runningsum[0]=nums[0];
       
       for(int i=1;i<n; i++){
        runningsum[i]=runningsum[i-1]+nums[i];
       }
       return runningsum;
    }
}