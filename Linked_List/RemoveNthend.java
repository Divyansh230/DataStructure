package Linked_List;
import java.util.*;

public class RemoveNthend {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    Node head = null;

    void add(int val) {
        Node t = new Node(val);
        if (head == null)
            head = t;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = t;
        }
    }

    void delete(int n) {
        Node fast = head;
        Node slow = head;

        // Move fast pointer to the nth node
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("Invalid position");
                return;
            }
            fast = fast.next;
        }

        // If fast is null, delete the head
        if (fast == null) {
            head = head.next;
            return;
        }

        // Move both fast and slow pointers until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node
        slow.next = slow.next.next;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        RemoveNthend ob = new RemoveNthend();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            ob.add(sc.nextInt());
        int num = sc.nextInt();
        ob.delete(num);
        ob.display();
    }
}
