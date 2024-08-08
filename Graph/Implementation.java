package Graph;
import java.util.*;
class Graphs{
    int v;
    ArrayList<ArrayList<Integer>> adj;
    Graphs(int V){
        v=V;
        adj=new ArrayList<>(v);
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
    }
    void add(int s,int d){
        adj.get(s).add(d);
        adj.get(d).add(s);
    }
    void print(){
        for(int i=0;i<adj.size();i++){
            System.out.println(i+":"+adj.get(i));

        }
    }
}
public class Implementation {
    public static void main(String[] args) {
        int x=5;
        Graphs grf=new Graphs(x);
        grf.add(0,1);
        grf.add(0,4);
        grf.add(1,2);
        grf.add(1,3);
        grf.add(1,4);
        grf.add(2,3);
        grf.add(3,4);
        grf.print();

    }

}
