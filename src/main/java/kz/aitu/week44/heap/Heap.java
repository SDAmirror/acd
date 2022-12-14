package kz.aitu.week44.heap;

public class Heap {

    Node root;


    public Heap() {


        root = null;

    }

    public int finder(int data){
        Node temp = root;
        while (temp.data!=data){
            if(data<temp.data){
                temp=temp.left;
            }else{
                temp=temp.rigth;
            }
        if(temp==null){
            return 0;


        }
        }



        return temp.data;
    }
    public void insert(int newdata) {
        Node newNode = new Node(newdata);
        if (root == null) {
            root = newNode;
        } else {
            Node newParent = root;
            Node parent;
            while (true){


                parent =newParent;

                if(newdata<newParent.data) {
                newParent=newParent.left;
                    if(newParent==null){
                        parent.left=newNode;
                    return;
                    }
                }else {
                    newParent=newParent.rigth;
                    if(newParent==null){
                        parent.rigth=newNode;
                        return;
                    }

                }
                }

            }




        }
    }

