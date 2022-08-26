package node;

public class Node {

    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return this.data;
    }

    public Node getNextNode() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {

    }
}