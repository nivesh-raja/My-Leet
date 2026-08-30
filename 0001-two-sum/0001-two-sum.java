class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        for (int x : nums){
            int a = target - x;
            if (map.containsKey(a)){
                return new int[]{map.get(a),i};
            }
            else{
                map.put(x,i);
            }
            i++;
        }
        return new int[] {};
    }
}