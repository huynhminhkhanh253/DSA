package Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A", "B");
        myGraph.addVertex("C");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.print();
        //myGraph.removeEdge("A", "B");
        //myGraph.print();
        myGraph.removeVertex("C");
        myGraph.print();
    }
}
