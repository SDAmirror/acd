package kz.aitu.MID1;
/**
 *
 *Answer for Test question
 *b
 *a
 *b
 *d
 *e
 */

public class LinkedLIst {

    public Node tail;
    public Node head;

    LinkedLIst(){
            this.head=null;
            this.tail=null;
        }

        public void delete(int position){

        Node temp=head;
        for (int i=0;i<position-1;i++){
            temp=temp.next;
        }
        temp=temp.next.next;


        }


        public void push(int data) {
            Node newNode = new  Node(data);
            if (this.head == null) {
                this.head = newNode;
                tail=newNode;
            } else {
                tail.next=newNode;
                tail=newNode;
            }
        }


}
