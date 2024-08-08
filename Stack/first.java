package Stack;

public class first {
    int []st;
    int size;
    public first(){
        st=new int[5];
    }
    public first(int size){
        st=new int[size];
    }
    int tos=-1;
    boolean is_empty(){
        if(tos==-1)return true;
        return false;
    }
    boolean is_full(){
        if(tos==st.length-1)
            return true;
        return false;

    }
    public void push(int val){
        if(tos==st.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        tos++;
        st[tos]=val;
        size++;
    }

    public static void main(String[] args) {
        first ob=new first();
        ob.push(5);
        ob.push(7);
        ob.push(7);
    }
}
