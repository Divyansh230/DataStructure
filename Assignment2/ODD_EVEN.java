package Assignment2;
import java.util.*;

public class ODD_EVEN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ODD_EVEN ob = new ODD_EVEN();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            ob.add(sc.nextInt());
        Node h = ob.sep_odd_eve();
        ob.display(h);
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    void add(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = temp;
        else {
            Node t = head;
            while (t.next != null)
                t = t.next;
            t.next = temp;
        }
    }

    void display(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
    }

    Node sep_odd_eve() {
        Node odd = new Node(-1);
        Node even = new Node(-1);
        Node op = odd;
        Node ep = even;
        Node t = head;
        while (t != null) {
            if (t.val % 2 != 0) {
                op.next = t;
                op = op.next;
            } else {
                ep.next = t;
                ep = ep.next;
            }
            t = t.next;
        }
        op.next = even.next;
        ep.next=null;
        return odd.next;
    }
}
