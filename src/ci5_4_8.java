/*
 * two very large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes.
 * create an algorithm to decide if T2 is a subtree of T1
 */
public class ci5_4_8 {
	public boolean containsTree(TreeNode t1, TreeNode t2){
		if(t2 == null){
			return true;
		}
		return subTree(t1, t2);
	}
   public boolean subTree(TreeNode t1, TreeNode t2){
	   if(t1 == null){
		   return false;
	   }
	   if(t1.val == t2.val){
		   boolean match = matchTree(t1, t2);
		   if(match){
			   return true;
		   }
	   }
	  
	   return subTree(t1.left, t2) || subTree(t1.right, t2);	   
   }
   public boolean matchTree(TreeNode t1, TreeNode t2){
	   if(t1 == null && t2 == null){
		   return true;
	   }
	   if(t1 == null || t2 == null){
		   return false;
	   }
	   if(t1.val != t2.val){
		   return false;
	   }
	   return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
   }
}
