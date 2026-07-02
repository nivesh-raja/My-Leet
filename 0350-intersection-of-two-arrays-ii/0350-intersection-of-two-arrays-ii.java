class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq[]= new int[1001];
        for (int x : nums1){
            freq[x]++;
        }
        List<Integer> set = new ArrayList<>();
        for (int n : nums2){
            if (freq[n] != 0){
                set.add(n);
                freq[n]--;
            }
        }
        int [] res = new int[set.size()];
        int i=0;
        for (int n : set){
            res[i++]=n;
        }
        return res;
    }
    
}