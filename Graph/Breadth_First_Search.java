package Graph;
import java.util.*;
public class Breadth_First_Search {
    public static void main(String[] args) {
        Graphs grf=new Graphs(10);
        Breadth_First_Search ob=new Breadth_First_Search();
      grf.add(1,2);
      grf.add(1,6);
      grf.add(2,3);
       grf.add(2,4);
       grf.add(6,7);
       grf.add(6,9);
      grf.add(7,5);
       grf.add(7,8);
        grf.add(5,8);
//        grf.print();
        System.out.println(ob.bfs(10,grf.adj));

    }
    ArrayList<Integer> bfs(int V,ArrayList<ArrayList<Integer>> graph){
        boolean visit[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(1);
        visit[1]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int i:graph.get(node)){
                if(!visit[i]){
                    q.add(i);
                    visit[i]=true;
                }
            }
        }
        return ans;
    }
}
