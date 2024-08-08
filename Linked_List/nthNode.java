package Linked_List;
import java.util.Scanner;
public class nthNode {
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
    Node find_nth_end(int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++)
            fast=fast.next;
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        nthNode ob=new nthNode();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            ob.add(sc.nextInt());
        int num=sc.nextInt();
        Node mid=ob.find_nth_end(num);
        System.out.print(mid.val);
    }
}
