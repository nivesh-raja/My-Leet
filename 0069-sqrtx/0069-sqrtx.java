class Solution {
    public int mySqrt(int x) {
        int n=1;
        while (true){
            if ((long)n*n<=x){
                n++;
            }else{
                break;
            }
        }
        return n-1;
    }
}