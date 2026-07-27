class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;

        for (int a : nums) {
            if (a == max || a == secondmax || a == thirdmax) {
                continue;
            }

            if (a > max) {
                thirdmax = secondmax;
                secondmax = max;
                max = a;
            } 
            else if (a > secondmax) {
                thirdmax = secondmax;
                secondmax = a;
            } 
            else if (a > thirdmax) {
                thirdmax = a;
            }
        }

        if (thirdmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) thirdmax;
    }
}