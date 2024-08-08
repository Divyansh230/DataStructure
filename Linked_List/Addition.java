package Linked_List;
import java.util.*;
public class Addition {
     class Node{
         int val;
         Node next;
         Node(int val){
             this.val=val;
         }
     }

    Node add(Node head1,Node head2){
         Node t1=head1;
         Node t2=head2;
         Node temp=new Node(0);
         Node t=temp;int c=0;
         while(t1!=null || t2!=null){
             int sum=c;
             if(t1!=null)sum=sum+t1.val;
             if(t2!=null)sum=sum+t2.val;
             Node newN=new Node(sum%10);
             t.next=newN;
             t=t.next;
             c=sum/10;
             if(t1!=null)t1=t1.next;
             if(t2!=null)t2=t2.next;
         }
         if(c!=0)
             t.next=new Node(c);
         return temp;
    }
    Node add(Node head, int val){
         Node t=new Node(val);
        if(head==null)head=t;
        else{
            Node temp=head;
            while(temp!=null)temp=temp.next;
            temp.next=t;
        }
        return head;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         Addition ob=new Addition();
         int n=sc.nextInt();
         int m=sc.nextInt();
         Node head1=null;
         Node head2=null;
         for(int i=0;i<n;i++)
             ob.add(head1,sc.nextInt());
    }
}
