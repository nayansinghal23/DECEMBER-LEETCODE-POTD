// https://www.youtube.com/watch?v=3Et9MrMc02A
/*
 class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.empty()) {
            while(!input.empty()) {
                output.push(input.peek());
                input.pop();
            }
        }
        int x = output.peek();
        output.pop();
        return x;
    }
    
    public int peek() {
        if(output.empty()) {
            while(!input.empty()) {
                output.push(input.peek());
                input.pop();
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return (output.size() + input.size() == 0);
    }
}
 */