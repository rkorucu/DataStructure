package BinarySearchTree;

public class NodeBST {
   private NodeBST leftChild;
   private NodeBST rightChild;
  private   int data;



    public NodeBST(int data) {
        leftChild=null;
        rightChild=null;
        this.data = data;
    }

    public NodeBST getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodeBST leftChild) {
        this.leftChild = leftChild;
    }

    public NodeBST getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodeBST rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
