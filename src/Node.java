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
    public static void main(String[] args) {
        Node node = new Node("A");

        System.out.println(node);
    }
}