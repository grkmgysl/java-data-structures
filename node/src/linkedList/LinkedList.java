package linkedList;
import node.Node;

import java.sql.SQLOutput;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addToHead(String data){
        Node nodeToAdd = new Node(data);
        Node currentHead = this.head;
        this.head = nodeToAdd;

        //if current head exists, set the next property of the head to current head(becomes second in the Linked list)
        if(currentHead != null){
            this.head.setNext(currentHead);
        }
    }

    public String removeHead(){
        Node removedHead = this.head;
        if(removedHead == null){
            return null;
        }
        // if there is head, set the head property of Linked list to second object in the list
        this.head = removedHead.getNextNode();
        return removedHead.getData();
    }

    public void addToTail(String data){
        Node current = this.head;
        Node nodeToAdd = new Node(data);

        // if list is empty make nodeToAdd head
        if(current == null){
            this.head = nodeToAdd;
        } else {
            //get to the tail of the list and make the next property of tail nodeToAdd
            while(current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNext(nodeToAdd);
        }
    }

    public void printList(){
        Node current = this.head;
        String output = "<head> ";
        while(current != null){
            output += current.getData() + " ";
            current = current.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
    }
/*
    public Node removeByData(String data){
        Node current = this.head;
        Node nodeToRemove = null;

        while(current != null){
            if(current.getData() != data){
                nodeToRemove = current;
                break;
            }
            current = current.getNextNode();
        }
        if(nodeToRemove == null){
            return null;
        }
        if(nodeToRemove == this.head){
            this.removeHead();
        }
        if(nodeToRemove == )
    }
*/
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.addToHead("10");
        newLinkedList.addToHead("5");
        newLinkedList.addToTail("20");
        newLinkedList.addToTail("30");
        newLinkedList.addToTail("40");
        newLinkedList.removeHead();
        newLinkedList.printList();

    }
}
