class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String str : arr){
            StringBuilder rev = new StringBuilder(str);
            rev.reverse();
            reverse.append(rev).append(" ");
        }
        return reverse.toString().trim();
    }
}