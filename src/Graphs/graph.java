package Graphs;

public class graph {
    int vertices;
    DoublyLinkedList<Integer> adj[];

    public graph(int vertices){
        this.vertices=vertices;
        adj=new DoublyLinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i]=new DoublyLinkedList<>();
        }
    }
    public void addEdge(int source,int destination){
        if (source<vertices && destination<vertices){
            adj[source].insertEnd(destination);
        }
    }

}

