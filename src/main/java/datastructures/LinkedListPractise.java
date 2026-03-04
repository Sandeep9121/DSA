package datastructures;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.LinkedList;

public class LinkedListPractise {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListPractise(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }

        size += 1;
    }


    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;

        size =size+1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(size);
    }

    public void insertAtpostion(int value, int position){
        if(position==0){
            insertFirst(value);
            return;
        }
        if(position==size){
            insertLast(value);
            return;
        }

         Node temp=head;

        for (int i=1 ; i<position;i++){
            temp=temp.next;
        }

        Node newNode;
        newNode = new Node(value,temp.next);
        temp.next=newNode;
    }

   // get the node based on index postion
    public Node get(int index){
        Node node=head;

        for(int i=0;i<index;i++){
            node =node.next;
        }

        return node;
    }

    private class Node{
         private int value;
         private Node next;

         public Node(int value){
             this.value=value;
         }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }

    public static void main(String[] args) {

        LinkedListPractise lls=new LinkedListPractise();
        lls.insertFirst(2);
        lls.insertFirst(3);
        lls.insertLast(5);
        lls.insertFirst(51);
        lls.insertLast(30);
        lls.display();
        lls.insertAtpostion(11,3);
        System.out.println( lls.deleteFirst());
        lls.display();

        System.out.println(lls.get(0).value);


    }

    private int deleteFirst() {
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }

        return  val;
    }

}
