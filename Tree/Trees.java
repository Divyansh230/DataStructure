package Tree;

import java.util.Scanner;
import java.util.Stack;

public class Trees {
    Scanner sc = new Scanner(System.in);

    public class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    Node root = null;

    public void create() {
        root = create(root);
    }

    private Node create(Node root) {

        int data = sc.nextInt();
        root = new Node(data);

        System.out.println("left");
        boolean hls = sc.nextBoolean();
        if (hls) {
            root.left = create(root.left);
        }

        System.out.println("right");
        boolean hrs = sc.nextBoolean();
        if (hrs) {
            root.right = create(root.right);
        }

        return root;
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public void postorder(){
        postorder(root);
    }
    private void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        preorder(root.right);
        System.out.println(root.val);
    }
    private void iniorder(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node k=st.pop();
            System.out.println(k.val);
            if(k.right!=null)st.push(k.right);
            System.out.println(k.val);
            if(k.left!=null)st.push(k.left);
        }
    }

    private void preiorder(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node k=st.pop();
            System.out.println(k.val);
            if(k.right!=null)st.push(k.right);
            if(k.left!=null)st.push(k.left);
        }
    }
    private void postiorder(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node k=st.pop();
            System.out.println(k.val);
            if(k.right!=null)st.push(k.right);
            if(k.left!=null)st.push(k.left);
            System.out.println(k.val);

        }
    }
}
