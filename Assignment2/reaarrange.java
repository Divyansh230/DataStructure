package Assignment2;
import java.util.*;
public class reaarrange {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node head;
    void add(int val){
        Node nn=new Node(val);
        if(head==null)head=nn;
        else{
            Node t=head;
            while(t.next!=null)t=t.next;
            t.next=nn;
        }
    }
    void arrange(int k){
        if(head==null || k==0)return;
        Node t=head;
        int length=1;
        while(t.next!=null){
            length++;
            t=t.next;
        }
        k=k%length;
        if(k==0)return ;
        Node nh=head;
        Node prev=null;
        for(int i=0;i<length-k;i++){
            prev=nh;
            nh=nh.next;
        }
        t.next=head;
        head=nh;
        prev.next=null;
    }

    public static void main(String[] args) {

    }
}
