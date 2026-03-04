package datastructures;

public class practice {

    private MyNode head;

    private MyNode tail;



    public void insertFirst(int val){
        MyNode node =new MyNode(val);
        node.next=head;
        head=node ;

        if(tail==null){
            tail=head;
        }


    }

      public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        }
        MyNode node =new MyNode(val);
         tail.next =node ;
          tail =node;

      }

    public void display(){
        MyNode temp=head;
        while(temp!=null){
            System.out.println(head.data+"->");
            temp=temp.next;
        }


    }






    private class MyNode{
        private int data;
        private MyNode next ;

        public MyNode(int data, MyNode next) {
            this.data = data;
            this.next = next;
        }

        public MyNode(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {

        practice p=new practice();

        p.insertFirst(1);
        p.display();

    }
}
