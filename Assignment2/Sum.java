package Assignment2;
import java.util.*;
public class Sum {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node add(int val,Node head){
        Node nn=new Node(val);
        if(head==null)head=nn;
        else{
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=nn;
        }
        return head;
    }
    void adds(Node l1,Node l2){
        Node t1=l1;
        Node t2=l2;
        Node dummy=new Node(-1);
        Node t=dummy;
        int carry=0;
        while(t1!=null || t2!=null){
            int sum=carry;
            if(t1!=null)sum=sum+t1.val;
            if(t2!=null)sum=sum+t2.val;
            t.next=new Node(sum%10);
            t=t.next;
            carry=sum/10;
            if(t1!=null)t1=t1.next;
            if(t2!=null)t2=t2.next;
        }
        if(carry>0){
            t.next=new Node(carry);
        }
        dummy=dummy.next;
        dummy=reverse(dummy);
        t=dummy;
        while(t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Sum ob=new Sum();
        int n=sc.nextInt();
        Node head1=null;
        Node head2=null;
        for(int i=0;i<n;i++){
            head1=ob.add(sc.nextInt(),head1);
        }
        for(int i=0;i<n;i++){
            head2=ob.add(sc.nextInt(),head2);
        }
         head1=ob.reverse(head1);
         head2=ob.reverse(head2);
         ob.adds(head1,head2);
    }
    Node reverse(Node head){
        Node prev=null;
        Node nxt=null;
        Node t=head;
        while(t!=null){
            nxt=t.next;
            t.next=prev;
            prev=t;
            t=nxt;
        }
         return prev;
    }

}
