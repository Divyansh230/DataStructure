package Assignment2;
import java.util.Scanner;
public class merge_sort {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node  add(int val,Node head) {
        Node temp = new Node(val);
        if (head == null)
            head = temp;
        else {
            Node t = head;
            while (t.next != null)
                t = t.next;
            t.next = temp;
        }
        return head;
    }
    Node merge(Node head1,Node head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
        if(head1.val<head2.val){
            head1.next=merge(head1.next,head2);
            return head1;
        }
        else{
            head2.next=merge(head1,head2.next);
            return head2;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        merge_sort ob=new merge_sort();
        Node head1=null;
        Node head2=null;
        for(int i=0;i<n;i++)head1=ob.add(sc.nextInt(),head1);
        for(int i=0;i<m;i++)head2=ob.add(sc.nextInt(),head2);
        Node x=ob.merge(head1,head2);
        while(x!=null){
            System.out.print(x.val+" ");
            x=x.next;
        }
    }
}
