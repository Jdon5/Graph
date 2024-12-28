import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");

        Edge edge1 = new Edge(nodeA,nodeB);
        Edge edge2 = new Edge(nodeB,nodeC);
        DirectedEdge edge3 = new DirectedEdge(nodeC, nodeD);
        WeightedEdge edge4 = new WeightedEdge(nodeD, nodeE, 2);


        Node[] nodeArr = {nodeA,nodeB,nodeC,nodeD};
        Edge[] edgeArr = {edge1,edge2,edge3,edge4};


        Graph graph = new Graph(Arrays.asList(nodeArr),Arrays.asList(edgeArr));
        System.out.println(graph);
    }
}
