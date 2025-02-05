
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    int maxAscendingSum(const vector<int>& input) const {
        int currentSum = input[0];
        int maxAscendingSubarraySum = input[0];

        for (int i = 1; i < input.size(); ++i) {
            if (input[i - 1] >= input[i]) {
                maxAscendingSubarraySum = max(maxAscendingSubarraySum, currentSum);
                currentSum = input[i];
                continue;
            }
            currentSum += input[i];
        }
        return max(maxAscendingSubarraySum, currentSum);
    }
};
