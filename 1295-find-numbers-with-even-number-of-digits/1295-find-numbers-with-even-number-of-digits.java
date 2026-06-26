class Solution {
    public int findNumbers(int[] nums) {
        int counta=0;
        for (int num : nums){
            int countb=0;
            while (num!=0){
                num=num/10;
                countb++;
            }
            if(countb%2 == 0){
                counta++;
            }
        }
        return counta;

    }
}