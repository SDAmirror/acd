package kz.aitu.additional;

public class Node       {
        int data;
        String value;
        Node next;
        Node previous;


        public Node(int nodeData, String value) {
                this.value=value;
                this.next=null;
                this.previous=null;
                this.data = nodeData;
        }
}
