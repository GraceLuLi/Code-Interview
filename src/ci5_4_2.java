import java.util.*;

/*
 *  given a directed graph, design an algorithm to find out whether there is a route between two nodes
 */

public class ci5_4_2 {
	// Method 1, with BFS algorithm
      public boolean isRoute(Graph g, Node a, Node b){
    	  Queue<Node> q = new LinkedList<Node>();
    	  a.visited = true;
    	  q.add(a);
    	  while(!q.isEmpty()){
    		  Node curr = q.remove();
    		  for(Node child : g.getChildren(curr)){
    			  if(!child.visited){
    				  child.visited = true;
        			  if(child.equals(b)){
        				  return true;
        			  }
    				  q.add(child);
    			  }
    		  }
    	  }
    	  return false;
      }
      // Method 2, with DFS algorithm
      public boolean isRoute2(Graph g, Node a, Node b){
    	  Stack<Node> s = new Stack<Node>();
    	  a.visited = true;
    	  s.push(a);
    	  while(!s.isEmpty()){
    		  Node curr = s.pop();
    		  for(Node child : g.getChildren(curr)){
    			  if(!child.visited){
    				  child.visited = true;
        			  if(child.equals(b)){
        				  return true;
        			  }
        			  s.push(child);
    			  }
    		  }
    	  }
    	  return false;
      }
}
