package BinarySearchTree;

import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binary=new BinarySearchTree();


        binary.add(6);
        binary.add(4);
       // binary.add(2);
        binary.add(5);
        binary.add(9);
        binary.add(8);
        binary.add(12);
        binary.delete(9,binary.getRoot());

//        binary.print(binary.getRoot());
//        System.out.println();
//        binary.addRecursive(6);
//        binary.addRecursive(4);
//        binary.addRecursive(2);
//        binary.addRecursive(5);
//        binary.addRecursive(9);
//        binary.addRecursive(8);
//        binary.addRecursive(12);
//      binary.print(binary.getRoot());

//     BinarySearchTree.preTraversal(binary.getRoot());
//        System.out.println();
//    BinarySearchTree.preTraversalIterative(binary.getRoot());
//        System.out.println();
//   BinarySearchTree.inOrderTraversal(binary.getRoot());
//        System.out.println();
//        BinarySearchTree.inOrderIterative(binary.getRoot());
//        System.out.println();
//        BinarySearchTree.postTraverseOrder(binary.getRoot());
//        System.out.println();
//        BinarySearchTree.postOrderTraverseIterative(binary.getRoot());

    }



}
