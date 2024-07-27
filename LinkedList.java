package linkedlist;

public class LinkedList {
   private Node head;
   private Node tail;
   private int size;
     class Node{
         int value;
         Node next;
         Node(int value){
             this.value=value;
         }
         Node(int value,Node next){
             this.value=value;
             this.next=next;
         }
     }
     public void insertFirst(int val){
         Node node=new Node(val);
         node.next=head;
         head=node;
         if(tail==null){
             tail=head;
         }
         size+=1;
     }
     public void insertAtEnd(int val){
         if(tail==null) {
             insertFirst(val);
             return;
         }
         Node node=new Node(val);
         tail.next=node;
         tail=node;
         size+=1;
     }
     public void insertAtPos(int val,int pos){
         if(pos==1) {
             insertFirst(val);
             return;
         }
         if(pos==size){
             insertAtEnd(val);
             return;
         }
         int i=1;
         Node temp=head;
         while(i<pos){
             temp=temp.next;
             i++;
         }
         Node node=new Node(val);
         node.next=temp.next;
         temp.next=node;
         size++;
     }
     public int deleteAtFirst(){
         int val=head.value;
         head=head.next;
         if(head==null){
             tail=null;
         }
         size--;
         return val;
     }



}
