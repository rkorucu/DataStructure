import java.util.Comparator;

public class PriorityQueueCustom<T> {
     private NodeQueue<T> head;
    Comparator<T> comparator;

    public PriorityQueueCustom(Comparator<T> comparator) {
        this.comparator = comparator;
    }
    public void add(T val){
        NodeQueue<T> newNode=new NodeQueue<>(val);
        NodeQueue  prev=null;
        NodeQueue current=head;

        while (current!=null&&comparator.compare(val,(T) current.getVal())>0 ){
            prev=current;
            current=current.getNext();
        }
        if (prev==null){
            newNode.setNext(head);
            head=newNode;
        }else{
            prev.setNext(newNode);
            newNode.setNext(current);
        }
        return;
    }

    public void print(){
        NodeQueue<T> print=head;
        while (print!=null){
            System.out.println("Priority queue is : " + print.getVal().toString());
            print=print.getNext();
        }
    }

}

