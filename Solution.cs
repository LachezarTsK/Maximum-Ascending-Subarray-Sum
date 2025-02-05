
using System;

public class Solution
{
    public int MaxAscendingSum(int[] input)
    {
        int currentSum = input[0];
        int maxAscendingSubarraySum = input[0];

        for (int i = 1; i < input.Length; ++i)
        {
            if (input[i - 1] >= input[i])
            {
                maxAscendingSubarraySum = Math.Max(maxAscendingSubarraySum, currentSum);
                currentSum = input[i];
                continue;
            }
            currentSum += input[i];
        }
        return Math.Max(maxAscendingSubarraySum, currentSum);
    }
}
