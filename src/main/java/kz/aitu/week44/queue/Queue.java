package kz.aitu.week44.queue;

public class Queue {
    Node head;
    Node tail;

public void Queue(){
    this.head=null;
    this.tail=null;
}


    public void add(int data) {
        Node Ndata = new Node(data);
        if (this.head == null) {
            this.head = Ndata;
            tail=Ndata;
        } else {
            tail.next=Ndata;
            tail=Ndata;
        }
    }
    public void delete(int position){

       Node temp=head;
        for (int i=0;i<position-1;i++){
            temp=temp.next;
        }
        temp=temp.next.next;


    }
    public int peek() {

        if (head==null){

            return 0;
        }
        else return head.data;

    }

    public Node poll() {
        Node temp = head;
        if (head == null)
            return null;

            head=head.next;

        return temp;


    }


    public int Size(){
        if(head==null) return 0;
        int counter=0;
        Node temp=head;
        while (temp!=null){
            counter++;
            temp=temp.next;
        }
        return counter;

    }

    public boolean isEmpty() { return head == null; }
}

