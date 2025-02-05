
function maxAscendingSum(input: number[]): number {
    let currentSum = input[0];
    let maxAscendingSubarraySum = input[0];

    for (let i = 1; i < input.length; ++i) {
        if (input[i - 1] >= input[i]) {
            maxAscendingSubarraySum = Math.max(maxAscendingSubarraySum, currentSum);
            currentSum = input[i];
            continue;
        }
        currentSum += input[i];
    }
    return Math.max(maxAscendingSubarraySum, currentSum);
};
