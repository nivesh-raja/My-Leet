class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int count=0;
        for (int i=0; i<k; i++){
            sum+=arr[i];
        }
        int temp = sum;
        if (temp/k >= threshold){
            count++;
            temp=0;
        }

        for (int i=k; i<n; i++){
            sum+=arr[i]-arr[i-k];
            temp = sum;
            if (temp/k >= threshold){
                count++;
                temp=0;
            }
        }
        return count;
    }
}