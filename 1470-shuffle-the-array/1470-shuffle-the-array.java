class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int [nums.length];
        int left = 0;
        int right = n;
        int ind = 0;
        while (ind <nums.length){
            ans[ind]= nums[left];
            left++;
            ind++;
            ans[ind]=nums[right];
            right++;
            ind++;
        }
        return ans;
        
    }
}