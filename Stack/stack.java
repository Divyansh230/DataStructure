package Stack;

public class stack {
    int st[];
    stack(){
        st=new int[5];
    }
    stack(int val){
        st=new int[val];
    }
    int tos=-1;
    boolean is_Empty(){
        if(tos==-1)return true;
        return false;
    }
    boolean is_full(){
        if(tos==st.length-1)return true;
        return false;
    }
    void push(int val){
        if(is_full()){
        System.out.print("Stack Overflow");
        return;
    }
        tos++;
    st[tos]=val;}
    void pop(){
        if(is_Empty()){
            System.out.print("Underflow");
        }
        st[tos]=0;
        tos--;
    }

    public static void main(String[] args) {
        stack stt=new stack();
        stt.is_Empty();

    }
}
