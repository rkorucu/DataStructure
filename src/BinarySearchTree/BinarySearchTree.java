package BinarySearchTree;

import java.util.Stack;

public class BinarySearchTree {

    private NodeBST root;

    public NodeBST getRoot() {
        return root;
    }

    public void setRoot(NodeBST root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(int data) {
        if (isEmpty()) {
            root = new NodeBST(data);
            return true;
        }
        NodeBST current = root;
        while (current != null) {
            NodeBST leftChild = current.getLeftChild();
            NodeBST rightChild = current.getRightChild();
            if (current.getData() >= data) {
                if (leftChild == null) {
                    leftChild = new NodeBST(data);
                    current.setLeftChild(leftChild);
                    return true;
                }
                current = leftChild;
            } else {
                if (rightChild == null) {
                    rightChild = new NodeBST(data);
                    current.setRightChild(rightChild);
                    return true;
                }
                current = rightChild;
            }
        }
        return false;
    }
    // add method using recursive
    public NodeBST recursiveAdd(NodeBST current,int data){
        if (current==null){
            return new  NodeBST(data);
        }
        if (data<current.getData()){
            current.setLeftChild(recursiveAdd(current.getLeftChild(),data));
        }else if(data>current.getData()){
            current.setRightChild(recursiveAdd(current.getRightChild(),data));
        }else {
           return current;
        }
        return current;
    }
    public  boolean addRecursive(int data){
         root=recursiveAdd(this.root,data);
         return true;
    }

    //3 conditions for delete
    //1.node is leaf node.
    //2.node has 1 child.
    //3.node has 2 children.
    public boolean delete(int data, NodeBST current) {

        if (root==null) return false;
        NodeBST parent=null;
        while (current!=null && current.getData()!=data){
            parent=current;
            NodeBST leftChild=current.getLeftChild();
            NodeBST rightChild=current.getRightChild();
            if (current.getData()>data){
                current=current.getLeftChild();
            }else{
                current=current.getRightChild();
            }

        }
        if (current==null){
         return false;
            // case 1: No child
        }else if (current.getLeftChild()==null && current.getRightChild()==null){
            if (root.getData()==current.getData()){
                setRoot(null);
                return true;
                // Case 2: one child there is
            }else if (current.getData()< parent.getData()){
                parent.setLeftChild(null);
                return true;
            }
            else {
                parent.setRightChild(null);
                return true;
            }
        } else if (current.getRightChild() == null) {
            if (root.getData()==current.getData()){
                setRoot(current.getLeftChild());
            }else if (current.getData()<parent.getData()){
                parent.setLeftChild(current.getLeftChild());
                return true;
            }else{
                parent.setRightChild(current.getRightChild());
                return true;
            }
        }else if (current.getLeftChild()==null){
            if (root.getData()==current.getData()){
                setRoot(current.getRightChild());
                return true;
            }else if (current.getData()< parent.getData()){
                parent.setLeftChild(current.getRightChild());
                return true;
            }else{
                parent.setRightChild(current.getRightChild());
                return true;
            }
            // case 3: 2 children
        }else {
            NodeBST findMin=findLeastNode(current.getRightChild());
             int temp=findMin.getData();
             delete(temp,root);
             current.setData(temp);
          return true;
        }
        return true;
    }
    private NodeBST findLeastNode(NodeBST currentNode){
        NodeBST bst=currentNode;
        while (bst.getLeftChild()!=null){
            bst=bst.getLeftChild();

        }
        return bst;
    }
    // recursive preOrder traversal
    public static void preTraversal(NodeBST root){
        if (root==null) return;;

        System.out.print(root.getData() +  " ");
        preTraversal(root.getLeftChild());
        preTraversal(root.getRightChild());

    }
  // iterative preOrder Traversal--> using stack
    public static void preTraversalIterative(NodeBST root){
        if (root==null) return;
        Stack<NodeBST> stack=new Stack<>();
        stack.push(root);
        System.out.print("Iterative preOrder :  " );
        while (!stack.isEmpty()){
            NodeBST current=stack.pop();
            System.out.print(+current.getData()+ "->");

            if (current.getRightChild()!=null){
                stack.push(current.getRightChild());
            }
            if (current.getLeftChild()!=null){
                stack.push(current.getLeftChild());
            }
        }
    }
   // in order traversal using recursive .
    public static void inOrderTraversal(NodeBST root){
        if (root==null) return;
        inOrderTraversal(root.getLeftChild());
        System.out.print(root.getData()+ " ");
        inOrderTraversal(root.getRightChild());
    }


    // iterative in order traversal
    public static void inOrderIterative(NodeBST root){
        if (root==null) return;

        Stack<NodeBST> stack=new Stack<>();
        NodeBST current=root;
        while (!stack.isEmpty() ||current!=null){
          if (current!=null){
              stack.push(current);
              current=current.getLeftChild();
          }
          else {
                NodeBST temp=stack.pop();
              System.out.print(temp.getData() + " ");
              current=temp.getRightChild();

          }
        }


    }
    public static void postTraverseOrder(NodeBST root){
        if (root==null) return;

        postTraverseOrder(root.getLeftChild());
        postTraverseOrder(root.getRightChild());
        System.out.print(root.getData() + "->");
    }


    public void print(NodeBST current) {
        if (current == null) return;

        System.out.print(current.getData() + ",");
        print(current.getLeftChild());
        print(current.getRightChild());
    }



}
