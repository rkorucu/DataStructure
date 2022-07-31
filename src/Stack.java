    public class Stack {
    int maxSize;
    NodeStack top ;      // head;


   public Stack() {
       this.maxSize = 0;
       this.top=null;
           }


   public boolean isEmpty(){
       return maxSize==0;
     }
     public int capacity(){
       return maxSize;
     }

     public void push(int value){
       NodeStack newNodeStack=new NodeStack();
          newNodeStack.val=value;
          newNodeStack.next=top;
          top=newNodeStack;
          maxSize++;

     }
   public int pop(){
       if (isEmpty()){
           System.out.println("Stack is empty");
       }

       int fistNumber=peek();  // fist of elements of stack in linkedList
       this.top=top.next;
       maxSize--;
       return fistNumber;

     }
   public int peek(){
       if (isEmpty()){
           System.out.println("Stack is empty...");
       }
       return top.val;

     }
   public int size(){
       return maxSize;
     }
   public boolean search(int item){
       if (isEmpty()){
           return false;
       }
       NodeStack nodeStack=top;
       while (nodeStack!=null){
           if (nodeStack.val==item){
               return  true;
           }
           nodeStack=nodeStack.next;
       }
       return false;
     }

  }


