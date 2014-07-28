/*
 *  implement a function to check if a binary tree is a binary search tree
 */
public class ci5_4_5 {
   public boolean checkBST(TreeNode root){
	   return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }
   public boolean checkBSTHelper(TreeNode n, int minimum, int maximum){
	   if(n == null){
		   return true;
	   }
	   if(n.val > maximum || n.val < minimum){
		   return false;
	   }
	   return checkBSTHelper(n.left, minimum, n.val) && checkBSTHelper(n.right, n.val, maximum);
   }
}
