    public class Stack {
    int size;
    Node top ;      // head;


   public Stack() {
       this.size = 0;
       this.top=null;
           }


   public boolean isEmpty(){
       return size==0;
     }
     public int capacity(){
       return size;
     }

     public void push(int value){
       Node newNodeStack=new Node(value);
          newNodeStack.val=value;
          newNodeStack.next=top;
          top=newNodeStack;
          size++;

     }
   public void pop(){
       if (top==null){
           System.out.println("Stack is empty");
           return ;
       }

       // fist of elements of stack in linkedList
       this.top=top.next;
       size--;


     }
   public int peek(){
       if (isEmpty()){
           System.out.println("Stack is empty...");
           return 0;
       }
       return top.val;

     }
   public int size(){
       return size;
     }
   public boolean search(int item){
       if (isEmpty()){
           return false;
       }
       Node nodeStack=top;
       while (nodeStack!=null){
           if (nodeStack.val==item){
               return  true;
           }
           nodeStack=nodeStack.next;
       }
       return false;
     }

  }


