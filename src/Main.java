
public class Main {
    public static void main(String[] args) {
      //  LinkedList list=new LinkedList();
//
//        list.insertFront(2);
//        list.insertFront(3);
//        list.insertFront(4);
//        list.insertFront(5);
//        list.insertFront(6);
//         list.print();


       Stack stack=new Stack();
       stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.search(4));
        System.out.println(stack.search(9));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());










    }
}
