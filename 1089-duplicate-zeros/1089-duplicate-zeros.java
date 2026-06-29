class Solution {
    public void duplicateZeros(int[] arr) {
        int [] res=new int[arr.length];
        int i=0; int j=0;
        while (i < arr.length && j<arr.length){
            res[j] = arr[i];
            if (arr[i]==0 && j+1<arr.length){
                res[j+1]=0; 
                j++;
            }
            i++;
            j++;

        }
        for (i=0; i<arr.length; i++){
            arr[i]= res[i];
        }
    }
}