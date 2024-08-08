package Assignment;

public class LinkedList {
    class Node {
        int data;
        Node next;
    }

    Node head = null;

    void addFirst(int val) {
        Node nn = new Node();
        nn.data = val;
        nn.next = head;
        head = nn;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println(); // Add a newline after printing all elements
    }

    Node getNode(int k) {
        Node temp = head;
        for (int i = 1; i <= k; i++)
            temp = temp.next;
        return temp;
    }

    void deleteNodes(int k) {
        if (k == 1) {
            head = head.next; // Update head if deleting the first node
            return;
        }
        Node temp = getNode(k - 1);
        if (temp.next != null) {
            temp.next = temp.next.next; // Update the next reference
        }
    }


    void reverseUtil(Node curr, Node prev) {
        if (curr.next == null) {
            head = curr; // Update head if reversing the first node
            curr.next = prev;
            return;
        }

        Node next1 = curr.next;
        curr.next = prev;
        reverseUtil( curr.next, prev);
    }

    public static void main(String[] args) {
        // Test your methods here
    }
}
