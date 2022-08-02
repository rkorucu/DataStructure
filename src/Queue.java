    public class Queue {
       Node front;
       Node rear;
        int queueSize;

   public Queue(){
       this.front=null;
       this.rear=null;
       this.queueSize=0;

   }
   public boolean isEmpty(){

      return queueSize==0 ;

   }
   public void enqueue(int data){

       Node queueNode=new Node(data);
       queueNode.val=data;
       queueNode.next=null;
      if(front==null && rear==null){
            rear=front=queueNode;
          return;
        }
       rear.next=queueNode;
       rear=queueNode;
       queueSize++;

   }
   public void  dequeue(){

       if (front==null) return;
       if (front==rear){
           front=rear=null;
       }
           front=front.next;
           queueSize--;

   }
   public int front(){
       if(isEmpty()) return 0;

    return front.val;

   }
   public int  queueSize(){
       System.out.println(queueSize);
       return queueSize;
   }
   public   void  print(){
       while (front!=null){
           System.out.println("Queue elements is : " + front.val);
           front=front.next;
       }

   }

}