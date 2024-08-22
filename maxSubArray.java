class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, 
        maxEndingHere = 0;

        for (int i = 0; i < nums.length; i++) {
            maxEndingHere += nums[i];

            maxSoFar = Math.max(maxSoFar, maxEndingHere);

            
            maxEndingHere = Math.max(maxEndingHere, 0);
        }
        return maxSoFar;

    }
}
