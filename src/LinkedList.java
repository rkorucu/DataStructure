    public class LinkedList {
        int size;
        Node head;
    /*
    insertion-->
     1.insertFront
     2.insertEnd
     3.insertByValue
     */
    public void insertFront(int data){
            Node newNode=new Node(data);
            newNode.val=data;
            newNode.next=head;
            head=newNode;
            size++;

    }
    public void  insertEnd(int data){
        if (head==null){
            insertFront(data);
            return;
        }
            Node newNode=new Node(data);
            newNode.val=data;
            newNode.next=null;

            Node current=head;
        while (current.next!=null){
            current=current.next;
        }
            current.next=newNode;
             size++;

    }
    public void insertByValue(int data,int newValue){
            Node newNode=new Node(newValue);
            newNode.val=newValue;
            Node current=head;
        while (current!=null &&current.val!=data){
            current=current.next;
        }
        if (current!=null){
            newNode.next=current.next;
            current.next=newNode;
            size++;
        }
    }

   /*
   Delete
    1.front
    2.end
    3.byValue
    */
    public void deleteListALLElements(){
            if (head==null) return;
                head=null;
                size=0;
   }
    public void deleteEnd(){
            if(size==1){
                head=null;
                return;
            }
            if (head==null) {
                return;
            }
                Node current=head;
            while (current.next.next!=null){
                current=current.next;
            }
                current.next=null;
                size--;
    }
    public void deleteFindFirstValue(int data){
                Node current=head;
                Node prev=null;
            if (head==null)
                return;
            if(current.val==data){
                head=head.next;
                size--;
                return;
            }
            while (current!=null) {
             if (current.val==data){
                prev.next = current.next;
                 size--;
                }
                prev=current;
                 current=current.next;
            }
    }
         /*
         UPDATE
         1.Update no value
         2.update with value

          */
    public void update(int val){
            if (head==null) {
                insertFront(val);

            }
    }
    public void updateWithValue(int val ,int secondValue){
                if (head==null) return;
                     Node currentNode=head;
            while (currentNode!=null){
                if (currentNode.val==val){
                    currentNode.val=secondValue;
                }
                    currentNode=currentNode.next;
            }
    }

    public void print(){
                Node print =head;
                System.out.print("List :");
            while (print.next!=null) {
                System.out.print(print.val + " ");
                print = print.next;
            }
                System.out.println(print.val + "--> null");

   }
}

