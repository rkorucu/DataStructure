import java.util.Hashtable;

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

//
//       Stack stack=new Stack();
//       stack.push(1);
//       stack.push(2);
//       stack.push(3);
//       stack.push(4);
//       stack.push(5);
//        System.out.println(stack.peek());
//        System.out.println(stack.size());

//        System.out.println(stack.search(4));
//        System.out.println(stack.search(9));
//        System.out.println(stack.peek());
//      stack.pop();
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());

//        Queue queue=new Queue();
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(6);
//         queue.print();
//
//        System.out.println(queue.isEmpty());
//

//
//        PriorityQueue  priorityQueue=new PriorityQueue();
//
//        priorityQueue.add(4);
//        priorityQueue.add(5);
//        priorityQueue.add(7);
//        priorityQueue.add(9);
//        priorityQueue.add(1);
//        priorityQueue.add(3);
//        priorityQueue.print();
//        System.out.println();
//        priorityQueue.pop();
//        priorityQueue.print();
//        System.out.println();
//        System.out.println(priorityQueue.size());

//
//         PriorityQueueCustom <Person>queueCustom=new PriorityQueueCustom<Person>(new Comparator<Person>() {
//      @Override
//      public int compare(Person o1, Person o2) {
//
//        return Integer.compare(o1.getAge(),o2.getAge());
//      }
//  });
//
//      queueCustom.add(new Person("Ramazan","Korucu",23));
//        queueCustom.add(new Person("Murat","Tuter",27));
//        queueCustom.add(new Person("Sukru","KIymaci",26));
//        queueCustom.add(new Person("Mevlut","Ince",23));
//        queueCustom.print();
//
//
//    }


		HashTable table = new HashTable(); //Create a HashTable
		//Before Insertion
		System.out.println("Table Size = " + table.size());
		table.insert("This",1 ); //Key-Value Pair
		table.insert("is",2 );
		table.insert("a",3 );
		table.insert("Test",4 );
		table.insert("Driver",5 );
		System.out.println("Table Size = " + table.size());
		// first search the key then delete it in the table
		// see the implementation first
		System.out.println(table.delete("is")+ " : This key is deleted from table");
		System.out.println("Now Size of the table = " + table.size() );
		if(table.isEmpty())
			System.out.println("Table is Empty");
		else
			System.out.println("Table is not Empty");

	}
}

