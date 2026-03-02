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

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;
        }
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

        lls.display();

    }

}
