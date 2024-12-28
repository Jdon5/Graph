public class WeightedDirectedEdge extends WeightedEdge {

    public WeightedDirectedEdge(Node from, Node to, double weight){
        super(from,to,weight);
    }

    public Node getFrom(){
        return getFirstNode();
    }

    public Node getTo(){
        return getSecondNode();
    }

    @Override
    public String toString(){
        return getFirstNode()+" -("+getWeight()+")-> "+getSecondNode();
    }
}
