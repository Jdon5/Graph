import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");

        Edge edge1 = new Edge(nodeA,nodeB);
        Edge edge2 = new Edge(nodeB,nodeC);
        DirectedEdge edge3 = new DirectedEdge(nodeC, nodeD);


        Node[] nodeArr = {nodeA,nodeB,nodeC,nodeD};
        Edge[] edgeArr = {edge1,edge2,edge3};


        Graph graph = new Graph(Arrays.asList(nodeArr),Arrays.asList(edgeArr));
        System.out.println(graph);
    }
}
