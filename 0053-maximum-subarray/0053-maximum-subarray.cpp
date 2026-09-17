class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = nums[0];
        int max = nums[0];

        int tempstart = 0;
        int start = 0;
        int end = 0;
        for (int i=1; i<nums.size(); i++){
            if (nums[i] > sum+nums[i]){
                sum = nums[i];
                tempstart = i;
            }
            else{
                sum += nums[i];
            }
            if (sum > max){
                max = sum;
                start = tempstart;
                end = i;
            }
        }
        return max;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna