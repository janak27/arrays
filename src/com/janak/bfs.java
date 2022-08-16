class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
      
      ArrayList<Integer> ans = new ArrayList<>();
      int a[] = new int[V+1];
      
      for(int i=1; i<=V; i++){
          if(a[i]==-1){
              
              Queue<Integer> q = new LinkedList<>();
              q.add(i);
              a[i]=1;
              
              while(!q.isEmpty()){
                  int b = q.poll();
                  ans.add(b);
                  
                  for(int c : adj.get(i)){
                      if(a[c]==-1){
                          a[c]=1;
                          q.add(c);
                      }
                  }
              }
          }
      }
      
      return ans;
       
    }
    
    
}
