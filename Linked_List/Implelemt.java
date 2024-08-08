package Linked_List;
import java.util.*;
public class Implelemt {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    Node add(Node head,int val){
        Node t=new Node(val);
        if(head==null)head=t;
        else{
            Node temp=head;
            while(temp!=null)temp=temp.next;
            temp.next=t;
        }
        return head;
    }
    Node addfirst(Node head,int val){
        Node t=new Node(val);
        t.next=head;
        return head;
    }
    Node addany(Node head,int val,int id){
        Node t=new Node(val);
        Node temp=head;
        for(int i=0;i<id-1;i++)
            temp=temp.next;
        t.next=temp.next;
        temp.next=t;
        return head;
    }
    Node del(Node head,int id){
        Node temp=head;
        for(int i=0;i<id-1;i++)
            temp=temp.next;
        temp.next=temp.next.next;
        return head;
    }
    void delN(Node a){
        a.val=a.next.val;
        a.next=a.next.next;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        Implelemt list=new Implelemt();
        for(int i=0;i<5;i++)
            list.add(head,i);
    }
}
