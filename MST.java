import java.util.*;

class MST {
    public int spanningTree(int V, int[][] edges) {
        // code here
        Arrays.sort(edges, (a,b) -> edges[a][2] - edges[b][2]);
        for(int[] edge: edges){
            System.out.println(edge[0]+" - "+edge[1]+" "+edge[2]);
        }
    }
}
