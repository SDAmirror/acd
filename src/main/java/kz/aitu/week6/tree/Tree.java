package kz.aitu.week6.tree;
import org.w3c.dom.ls.LSOutput;

import java.math.*;


public class Tree {
    Node root;
    int ball;
    int order=0;




    public Tree() {
        this.root = null;

    }






    public void insert(int newdata,String value) {
        Node newNode = new Node(newdata,value);
        if (root == null) {
            root = newNode;
        } else {
            Node newParent = root;
            Node temp;
            while (true) {
                temp = newParent;
                if (newdata < newParent.data) {
                    newParent = newParent.left;
                    if (newParent == null) {
                        temp.left = newNode;
                        return;
                    }
                } else {
                    newParent = newParent.right;
                    if (newParent == null) {
                        temp.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    //-------------------

    public void pyramid(String value){
        if(order==0)ball=80;
        if (order==1)ball=5;
        if(order>1)ball=3;
        if(order>4)ball=1;

        Node newNode = new Node(ball, value);
        if (root == null) {
            root = newNode;
            order++;
        } else {
            Node newParent = root;
            Node temp;
            while (true) {


                temp = newParent;

                if (ball < newParent.data) {
                    newParent = newParent.left;
                    if (newParent == null) {
                        temp.left = newNode;
                        return;
                    }
                } else {
                    newParent = newParent.right;
                    if (newParent == null) {
                        temp.right = newNode;
                        order++;
                        return;
                    }

                }
            }

        }




    }
    //-------------------------

    public static double log(int num) {
        int p = 0;
        for (int i = num; i >1; i /= 2) {
            p++;
        }
        return p;
    }



    //------------------------


    //-------------------
    public String finder(int data) {
        Node temp = root;
        while (temp.data != data) {
            if (data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
            if (temp == null) {
                return null;
            }
        }
    return temp.value;
    }

    private Node findNode(Node node, Integer key) {
        if(node == null) return null;
        if(key > node.data) return findNode(node.right, key);
        else if(key < node.data) return findNode(node.left, key);
        else return node;
    }

    public void printAll() {
        print(root);
        System.out.println();
    }
    public void print(Node node) {
        if(node == null) return;
        print(node.left);
        System.out.print(node.value+"->"+node.data);
        print(node.right);
    }
    public void printon(String name) {
        printOn(root,name);
        System.out.println();
    }
    public void printOn(Node node,String name) {
        if(node == null) return;
        printOn(node.left,name);

        if (node.value==name)System.out.print(node.value+"->"+node.data);
        printOn(node.right,name);
    }
    public void delete(Integer key) {
        if(root == null) return;if(root.data == key) {
            if(root.left == null && root.right == null)
                root = null;
        }
        delete(root, key);
    }

    public void delete(Node node, Integer key) {
        Node current = node;
        while(current != null) {
            if(key < current.data) {
                if(current.left != null && current.left.data==key) {

                    Node left = current.left;
                    if(left.left == null && left.right == null) {
                        current.left=null;
                    } else if(left.left == null || left.right == null) {
                        if(left.left != null) current.left=left.left;
                        else if(left.right != null) current.left=left.right;
                    }
                }
                current = current.left;
            } else {
                if(current.right != null && current.right.data==key) {
                    Node right = current.right;
                    if(right.left == null && right.right == null) {
                        current.right=null;
                    } else if(right.left == null || right.right == null) {
                        if(right.left != null) current.right=(right.left);
                        else if(right.right != null) current.right=(right.right);
                    }
                }
                current = current.right;
            }
        }

    }


}
