public class Stack {

    private int[] stack;
    private int top = 0;

    public Stack(int size){
        this.stack = new int[size];
    }

    public void push(int val){
        if (stack.length == top) {
            return;
        }
        stack[top] = val;
        top += 1;
    }

    public int pop() {
        if (top == 0){
            return -1;
        }
        top -= 1;
        return stack[top];
    }
    public int size(){
        return stack.length;
    }

    public int top(){
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void print(){
        for(int i = top-1 ;i>-1;i--){
            System.out.print(" "+ stack[i]);
        }
        System.out.print("\n");
    }
}