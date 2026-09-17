class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> freq;
        for (int i=0; i<nums.size(); i++){
            int needed = target - nums[i];
            if (freq.count(needed)){
                return {freq[needed],i};
                break;
            }
            freq[nums[i]] = i;
        }
        return {};
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna