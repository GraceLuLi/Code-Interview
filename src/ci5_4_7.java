/*
 *  Design an algorithm to find the first common ancestor of two nodes in a binary tree
 *  Avoid storing additional nodes in a data structure. NOET: this is not necessarily a
 *  binary search tree
 */
public class ci5_4_7 {
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2){
    	if(root == null || n1 == null || n2 == null){
    		return null;
    	}
    	boolean leftCoverN1 = cover(root.left, n1);
    	boolean leftCoverN2 = cover(root.left, n2);
    	boolean rightCoverN1 = cover(root.right, n1);
    	boolean rightCoverN2 = cover(root.right, n2);
    	
    	if(leftCoverN1 && rightCoverN2){
    		return root;
    	}
    	else if(leftCoverN1 && leftCoverN2){
    		return firstCommonAncestor(root.left, n1, n2);
    	}
    	else if(rightCoverN1 && rightCoverN2){
    		return firstCommonAncestor(root.right, n1, n2);
    	}
    	else{
    		return null;// n1 or n2 not in tree
    	}
    }
    public boolean cover(TreeNode root, TreeNode n){
    	if(root == null){
    		return false;
    	}
    	if(root.val == n.val){
    		return true;
    	}
    	return cover(root.right, n) || cover(root.left, n);
    }
}
