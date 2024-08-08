package Linked_List;
import java.util.*;
public class Reverse {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node head=null;
    void add(int val){
        Node t=new Node(val);
        if(head==null)head=t;
        else{
            Node temp=head;
            while(temp.next!=null)temp=temp.next;
            temp.next=t;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Reverse ob=new Reverse();
        for(int i=0;i<n;i++)
            ob.add(sc.nextInt());
        
    }
}
