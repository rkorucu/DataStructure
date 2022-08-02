    public class PriorityQueue {
        Node head;
        int size;


    public PriorityQueue(){
       head=null;
       size=0;
    }
    public boolean isEmpty(){
       return head==null;

    }

    public  void  add(int item) {
        Node newNode = new Node(item);
        Node previous = null;
        Node current = head;

        while (current != null && item > current.val) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            newNode.next = head;
            head = newNode;
        }else {
            previous.next = newNode;
            newNode.next = current;
        }
        size++;
    }
    public int peek(){
        if (!isEmpty()){
            return head.val;
        }
        return -1;
    }
    public int pop(){
        if (!isEmpty()){
            int data=head.val;
            head=head.next;
            System.out.println(" Pop data is : " + data);
            return data;
        }
        return -1;

    }

    public  int size(){
        return size;
    }

    public void print(){
            System.out.print("Priority queue is : " );
        Node print=head;
        while (print!=null){
            System.out.print(print.val + " ");
        print=print.next;
        }
    }
}
