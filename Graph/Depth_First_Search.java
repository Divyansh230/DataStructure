package Graph;
import java.util.*;
public class Depth_First_Search {
    public static void main(String[] args) {
        Depth_First_Search ob=new Depth_First_Search();
        Graphs grf=new Graphs(9);
        grf.add(1,2);
        grf.add(1,3);
        grf.add(2,5);
        grf.add(2,6);
        grf.add(3,4);
        grf.add(3,7);
        grf.add(4,8);
        grf.add(7,8);
        System.out.println(ob.dfs_Path(9,grf.adj));
    }
   ArrayList<Integer> dfs_Path(int V,ArrayList<ArrayList<Integer>> graph){
        int visit[]=new int[V];
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(1,ans,visit,graph);
        return ans;
   }
   void dfs(int node,ArrayList<Integer>ans,int visit[],ArrayList<ArrayList<Integer>> graph){
        visit[node]=1;
        ans.add(node);
        for(int i:graph.get(node)){
            if(visit[i]==0)
            dfs(i,ans,visit,graph);
        }
   }
}
