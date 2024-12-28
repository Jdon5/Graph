public class Node {

    private Object obj;

    public Node(Object obj){
        this.obj = obj;
    }

    public Object gObject(){
        return obj;
    }

    public String toString(){
        return "Node["+obj+"]";
    }
}