import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        Edge edge1 = new Edge(nodeA,nodeB);
        Edge edge2 = new Edge(nodeB,nodeC);

        for (Node i: edge1.getNodes()){
            System.out.println(i+" ");
        }

        Node[] nodeArr = {nodeA,nodeB,nodeC};
        Edge[] edgeArr = {edge1,edge2};

        Graph graph = new Graph(Arrays.asList(nodeArr),Arrays.asList(edgeArr));
        System.out.println(graph);
    }
}
