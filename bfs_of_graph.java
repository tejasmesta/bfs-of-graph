class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        boolean vis[] = new boolean[V+1];
        
        q.add(0);
        
        while(!q.isEmpty())
        {
            int rem = q.remove();
            
            ans.add(rem);
            
            vis[rem] = true;
            
            for(Integer j:adj.get(rem))
            {
                if(vis[j]==false)
                {
                    vis[j] = true;
                    q.add(j);
                }
            }
        }
        
        return ans;
        
    }
}
