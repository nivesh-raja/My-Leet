class MyStack {
    ListNode top;
    public MyStack() {
        top = null;
    }
    
    public void push(int x) {
        ListNode temp = new ListNode(x);
        temp.next = top;
        top = temp;
    }
    
    public int pop() {
        if (top == null){
            return -1;
        }
        ListNode temp = top;
        top = top.next;
        int val = temp.data;
        return val;
    }
    
    public int top() {
        if (top == null){
            return -1;
        }
        return top.data;
    }
    
    public boolean empty() {
        return top == null;
    }
}
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */