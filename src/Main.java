public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");

        Edge edge = new Edge(nodeA,nodeB);
        for (Node i: edge.getNodes()){
            System.out.println(i+" ");
        }
    }
    
}
