package LinkedList;

import org.w3c.dom.Node;

public class LL {
    private Node Head;
    private Node Tail;
    private int length;

    public LL(int value){
        Node newnode =new Node(value);
        Head=newnode;
        Tail=newnode;
        length=0;
    }
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
        public void Display(){
            Node temp=Head;
            while(temp!=null){
                System.out.println(temp.value);
                temp =temp.next;
            }


    }




}
