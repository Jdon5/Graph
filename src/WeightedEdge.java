public class WeightedEdge extends Edge{

    private double weight;

    public WeightedEdge(Node firstNode, Node secondNode, double weight){
        super(firstNode,secondNode);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return getFirstNode()+" -("+weight+")- "+getSecondNode();
    }
}
