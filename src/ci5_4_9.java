/*
 * given a binary tree in which each node contains a value.Design an algorithm to print all paths 
 * which sum to given value. The path does not need to start or end at the root or leaf
 */
import java.util.*;

public class ci5_4_9 {
   public void printPaths(TreeNode root, int value){
	   ArrayList<Integer> path = new ArrayList<Integer>();
	   printPathsHelper(root, value, path);
   }
   public void printPathsHelper(TreeNode n, int value, ArrayList<Integer> path){
	   if(n == null){
		   return;
	   }
	   ArrayList<Integer> clone = (ArrayList<Integer>) path.clone();
	   clone.add(n.val);
	   int sum = 0;
	   for(int i = clone.size()-1; i >= 0; --i){
		   sum += clone.get(i);
		   if(sum == value){
               printPath(clone, i);
               continue;
		   }
	   }
	   printPathsHelper(n.left, value, clone);
	   printPathsHelper(n.right, value, clone);
	   
   }
   public void printPath(ArrayList<Integer> path, int start){
	   System.out.println("path: ");
	   for(int i = start; i < path.size(); --i){
		   System.out.print(" " + path.get(i));
	   }
   }
}
