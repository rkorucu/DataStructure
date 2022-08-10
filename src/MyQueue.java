    import java.util.Stack;

    public class MyQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    int front ;
    public MyQueue() {
        front=0;
    }

    public void push(int x) {
        if(stack1.isEmpty())
            front=x;
        stack1.push(x);

    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());

        }
        return stack2.pop();

    }

    public int peek() {
        if(!stack2.isEmpty()){

            return  stack2.peek();
        }
        return front;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);




    }
        }
