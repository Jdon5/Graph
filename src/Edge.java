public class Edge {
    private Node firstNode;
    private Node secondNode;

    public Edge(Node firstNode, Node secondNode){
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    protected Node getFirstNode(){
        return this.firstNode;
    }

    protected Node getSecondNode(){
        return this.secondNode;
    }

    public Node[] getNodes(){
        return new Node[]{firstNode,secondNode};
    }

    @Override
    public String toString(){
        return firstNode+ " - "+secondNode; 
    }
}
