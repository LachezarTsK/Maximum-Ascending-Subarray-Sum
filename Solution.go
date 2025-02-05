
package main

func maxAscendingSum(input []int) int {
    currentSum := input[0]
    maxAscendingSubarraySum := input[0]

    for i := 1; i < len(input); i++ {
        if input[i-1] >= input[i] {
            maxAscendingSubarraySum = max(maxAscendingSubarraySum, currentSum)
            currentSum = input[i]
            continue
        }
        currentSum += input[i]
    }
    return max(maxAscendingSubarraySum, currentSum)
}
