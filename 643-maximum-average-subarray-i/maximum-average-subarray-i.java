class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first window of size k
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Step 2: Use sliding window to find the maximum sum subarray of size k
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];  // Slide the window
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return the maximum average
        return maxSum / k;
    }
}
