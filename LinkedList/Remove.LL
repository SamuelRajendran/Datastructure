public Node remove(int index){

    if(index < 0 || index >=length){
            return null;
            }

            if(index ==0){
            return RemoveFirstLL();
            }

            if(index ==length){
            return RemoveLL_LAST();
            }


            Node pre=get(index-1);
            Node temp=pre.next;

            pre.next=temp.next;
            temp.next=null;
            length --;
            return temp;
            }


            //output

            package LinkedList;

            public class LLMain {
                public static void main(String[] args) {
                    LL myLL=new LL(1);

                    myLL.appendlist(5);
                    myLL.appendlist(6);
                    myLL.appendlist(8);
                    myLL.remove(2);

                myLL.Display();




                }

            }
