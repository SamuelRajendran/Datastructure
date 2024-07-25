package LinkedList;

public class LL {
    private Node Head;
    private Node Tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LL(int value) {
        Node newnode = new Node(value);
        Head = newnode;
        Tail = newnode;
        length = 0;
    }

    public void Display() {
        Node temp = Head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void appendlist(int value) {
        Node newnode = new Node(value);

        if (length == 0) {
            Head = newnode;
            Tail = newnode;
        } else {
            Tail.next = newnode;
            Tail = newnode;
        }
        length++;


    }
    public void prepend(int value){
        Node newnode =new Node(value);
        if(length==1)
        {
            Head=newnode;
            Tail=newnode;

        }else{
            newnode.next=Head;
            Head=newnode;

        }length++;

    }
    public Node removelist(){

        if(length==0){
            return null;
        }
        Node temp=Head;
        Node pre=Head;
        if(temp.next!=null){
            pre =temp;
            temp=temp.next;
        }
        Tail=pre;
        Tail.next=null;
        length --;
        if(length==0){
            Head=null;
            Tail=null;
        }
        return temp;

    }
    public Node RemoveFirst(){
//if list is empty means do this
        if(length==0)return null;

//multiple item in the list

        Node temp=Head;
        Head=Head.next;
        temp.next=null;

        length--; //If it has one item in the list
        if(length==0){
            Tail=null;
        }
        return temp;
    }
    public Node get(int index){

// first we have to conform index range is under the given input
        if(index <0 || index >=length){
            return null;
        }
        Node temp=Head;
        for(int i=0;i< index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value){
        Node temp =get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }return false;
    }




}




