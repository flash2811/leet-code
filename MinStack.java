class Element{
    public int value;
    public int min;
    public Element next;
 
    public Element(int value, int min){
        this.value = value;
        this.min = min;
    }
}

class MinStack {

    public Element top;
    /** initialize your data structure here. */
    
    public void push(int x) {
        if(top == null) {
            top = new Element(x, x);
        }
        else {
            Element e = new Element(x, Math.min(x,top.min));
            e.next = top;
            top = e;
        }
    }
 
    public void pop() {
        if(top == null)
            return;
        Element temp = top.next;
        top.next = null;
        top = temp;
 
    }
 
    public int top() {
        if(top == null)
            return -1;
        return top.value;
    }
 
    public int getMin() {
        if(top == null)
            return -1;
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
