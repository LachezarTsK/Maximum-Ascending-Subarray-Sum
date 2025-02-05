
public class Solution {

    public int maxAscendingSum(int[] input) {
        int currentSum = input[0];
        int maxAscendingSubarraySum = input[0];

        for (int i = 1; i < input.length; ++i) {
            if (input[i - 1] >= input[i]) {
                maxAscendingSubarraySum = Math.max(maxAscendingSubarraySum, currentSum);
                currentSum = input[i];
                continue;
            }
            currentSum += input[i];
        }
        return Math.max(maxAscendingSubarraySum, currentSum);
    }
}
