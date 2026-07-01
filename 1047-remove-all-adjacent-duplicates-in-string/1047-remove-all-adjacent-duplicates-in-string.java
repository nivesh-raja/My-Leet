class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> res = new Stack<>();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i); 
            if (!res.isEmpty()){
                if (res.peek() == ch){
                    res.pop();
                }
                else{
                    res.push(ch);
                }
            }
            else{
                res.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()){
            sb.append(res.pop());
        }
        return sb.reverse().toString();
    }
}