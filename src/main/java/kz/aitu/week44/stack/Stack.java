package kz.aitu.week44.stack;




public class Stack {
    Node head;


    public void Push(int data) {
        Node nodeData = new Node(data);
        if (head == null) {
            head = nodeData;
        } else {
            nodeData.next = head;
            head = nodeData;
        }
    }

    public int peak() {
        if (head == null) {
            return 0;
        } else {
            return head.data;
        }
    }

    public int size() {
        Node temp = head;
        int counter = 0;
        if (head == null) {
            return 0;
        } else {
            while (temp != null) {
                temp = temp.next;
                counter++;
            }
        }
        return counter;
    }
        public int pop(){
            if (head==null) return 0;
            Node temp=head;
            head = head.next;
            return temp.data;
        }
        public boolean isEmpty(){
        return head==null;
        }
        public boolean isFull(){ return  head!=null;}



}


