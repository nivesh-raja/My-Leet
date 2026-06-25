class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int ind = 0;
        for (int i=0; i<n; i++){
            if (nums [i] > max){
                max2 = max;
                max = nums[i];
                ind = i;
            }
            else if (nums[i] < max && nums[i] > max2){
                max2 = nums[i];
            }
        }
        if (max >= 2*max2){
            return ind;
        }
        else{
            return -1;
        }
        
    }
}