package Assignment2;
import java.util.*;
public class Triplet_Sum {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node add(Node head,int val){
        Node nn=new Node(val);
        if(head==null)head=nn;
        else{
            Node t=head;
            while(t.next!=null)t=t.next;
            t.next=nn;
        }
        return head;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Triplet_Sum ob=new Triplet_Sum();
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        Node head1=null;
        Node head2=null;
        Node head3=null;
        for(int i=0;i<n;i++)head1=ob.add(head1,sc.nextInt());
        for(int i=0;i<m;i++)head2=ob.add(head2,sc.nextInt());
        for(int i=0;i<k;i++)head3=ob.add(head2,sc.nextInt());
        int target=sc.nextInt();
        ob.print(head1,head2,head3,target);
    }
    void print(Node headA,Node headB,Node headC,int target){
        Node pa=headA;
        Node pb=headB;
        Node pc=headC;
        while(pa!=null){
            pb=headB;
            while(pb!=null){
                pc=headC;
                while(pc!=null){
                    int s=pa.val+pb.val+pc.val;
                    if(s==target){
                        System.out.print(pa.val+""+pb.val+""+pc.val);
                        return ;
                    }
                    pc=pc.next;
                }
                pb=pb.next;
            }
            pa=pa.next;
        }
    }
}
