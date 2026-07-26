class Solution {
    public int missingNumber(int[] nums) {
         long n = nums.length;
        long sum =n*(n+1)/2;
        long numssum=0;
        for(int ele:nums){
            numssum+=ele;
        }
        return(int)(sum-numssum);
    }
}