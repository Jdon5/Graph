public class DirectedEdge extends Edge {

    public DirectedEdge(Node from, Node to){
        super(from, to);
    }

    public Node getFrom(){
        return getFirstNode();
    }

    public Node getTo(){
        return getSecondNode();
    }

    @Override
    public String toString(){
        return getFirstNode()+ " -> "+getSecondNode();
    }
}
