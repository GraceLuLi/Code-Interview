/*
 *  write an algorithm to find 'next'(i.e. in-order successor)
 */
public class ci5_4_6 {
	public TreeNode findNext(TreeNode n){
		if(n == null){
			return null;
		}
		if(n.right != null){
			return leftMostChild(n.right);
		}
		TreeNode curr = n;
		TreeNode p = n.parent;
		while(p != null && p.left != curr){
			p = p.parent;
			curr = curr.parent;
		}
		return p;
	}
	public TreeNode leftMostChild(TreeNode n){
		TreeNode p = n;
		while( p.left != null){
			p = p.left;
		}
		return p;
	}
	
   
}
