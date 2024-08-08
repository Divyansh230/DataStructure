package Linked_List;

public class Implementation {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }

    public static void main(String[] args) {

    }
    Node head=null;
    void add(int value){
        Node t=new Node(value);
        if(head==null){
            head=t;
        }
        else{
           Node temp=head;
           while(temp.next!=null)temp=temp.next;
           temp.next=t;
        }
    }
    void rev(){
        Node pre=null;
        Node next=null;
        Node cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
    }
}
