import java.util.List;
import java.util.ArrayList;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    public Graph(List<Node> nodes,List<Edge> edges){
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Node> getNodes(){
        return nodes;
    }
    public List<Edge> getEdges(){
        return edges;
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void removeEdge(Edge edge){
        edges.remove(edge);
    }

    public void removeNode(Node node){
        nodes.remove(node);
    }

    @Override
    public String toString(){
        return "Nodes: "+nodes+"\nEgdes: "+edges;
    }

}
