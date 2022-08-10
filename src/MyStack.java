import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
 Queue<Integer> queue1=new LinkedList<>();
 Queue<Integer> queue2=new LinkedList<>();
 int top;

    public MyStack() {
        top=0;

    }

    public void push(int x) {
        queue1.add(x);
        top=x;
        return;
    }

    public void pop() {
     while (queue1.size()>1){
         queue2.add(queue1.remove());
     }
     queue1.remove();
        Queue<Integer>temp=queue1;
        queue1=queue2;
        queue2=temp;

    }

    public int top() {
  return top();
    }

    public boolean empty() {
    return queue1==null;

    }
}



