class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> s1 = new Stack<>();
        Stack <Character> s2 = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch=='#' && s1.isEmpty()){
                continue;
            }
            if (ch=='#'){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        for (char ch : t.toCharArray()){
            if(ch=='#' && s2.isEmpty()){
                continue;
            }
            if (ch=='#'){
                s2.pop();
            }
            else{
                s2.push(ch);
            }
        }
        return s1.equals(s2);
    }
}