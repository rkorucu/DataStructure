package Graphs;

public class DoublyLinkedList<Integer> {


    public class Node{
        Node nextNode;
        Node prevNode;
         int data;
    }
    public Node tail;
    public Node head;
    public int size;

    public DoublyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    public boolean isEmpty(){
        if (head==null && tail==null){
            return true;
        }
        return false;
    }

    public int  capacity(){
         return size;
    }

    public void insertAt(int value){
        Node newNode=new Node();
        newNode.data=value;
        newNode.nextNode=head;
        newNode.prevNode=null;
        if (head!=null){
            head.prevNode=newNode;
        }else{
            tail=newNode;
            head=newNode;
            size++;
        }
    }
    public void insertEnd(int value){
        if (isEmpty()){
            insertAt(value);
        }
        Node newNode=new Node();
        newNode.data=value;
        newNode.nextNode=null;
        newNode.prevNode=tail;
        tail.nextNode=newNode;
        tail=newNode;
        size++;
    }
    public void deleteHead(){
        if (isEmpty()){
            return;
        }
        head=head.nextNode;
        if(head==null){
            tail=null;
        }else{
            head.prevNode=null;
            size--;
        }
    }
    public void deleteEnd(){
        if (isEmpty()){
            return;
        }

        tail=tail.prevNode;
        if (head==null){
            tail=null;
            return;
        }else{
            tail.nextNode=null;
            size--;
        }
    }


}
