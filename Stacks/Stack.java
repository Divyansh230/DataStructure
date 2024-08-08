package Stacks;

public class Stack {
    int arr[];
    int top;
    Stack(){
        arr=new int[5];
        top=-1;
    }
    boolean isEmpty(){
        return (top==-1);
    }
    boolean isFull(){
        return (top==arr.length);
    }
    void push(int val){
        if(isFull()){
            System.out.println("Overflow");
            return ;
        }
        arr[++top]=val;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return ;
        }
        top=top-1;
    }
    int top_of_stack(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(5);
        st.push(7);
        st.push(3);
        System.out.println(st.top_of_stack());
        st.pop();
        System.out.println(st.top_of_stack());
    }
}
