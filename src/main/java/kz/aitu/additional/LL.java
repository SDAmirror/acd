package kz.aitu.additional;

public class LL {
   public int size=0;
   public Node head;
   public Node tail;

    public void LL(){
        this.head=null;
        this.tail=null;
    }
    public void sort(){

        Node temp;

    }
    public void add(int key,String data){
        Node node= new Node(key,data);
        if (head==null){
            node.previous=head;
            head=node;
            tail=node;
            size++;
        }else {
            node.previous=tail;
            tail.next=node;
            tail=node;
            size++;
        }

    }
public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+temp.value);
        temp=temp.next;
        }
}
}
