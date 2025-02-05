
import kotlin.math.max

class Solution {

    fun maxAscendingSum(input: IntArray): Int {
        var currentSum = input[0]
        var maxAscendingSubarraySum = input[0]

        for (i in 1..<input.size) {
            if (input[i - 1] >= input[i]) {
                maxAscendingSubarraySum = max(maxAscendingSubarraySum, currentSum)
                currentSum = input[i]
                continue
            }
            currentSum += input[i]
        }
        return max(maxAscendingSubarraySum, currentSum)
    }
}
