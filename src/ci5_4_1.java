/*
 * implement a function to check if a binary tree is balanced
 */
public class ci5_4_1 {
	//Question: what is the definition of balanced binary tree
	//definition 1: the maximum height(of the whole tree) - minum height (of the whole tree) <= 1
	/*
	public boolean balancedTree(TreeNode root){
		return (maxH(root) - minH(root) <= 1);
	}
	public int minH(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1+Math.min(minH(root.left), minH(root.right));
	}
	public int maxH(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1+Math.max(maxH(root.left), maxH(root.right));
	}*/
	// definition 2: each subtree is a balanced tree
	public boolean balancedTree(TreeNode root){
		return (checkHeight(root) != -1);
	}
    public int checkHeight(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	int leftH = checkHeight(root.left);
    	if(leftH == -1){
    		return -1;
    	}
    	int rightH = checkHeight(root.right);
    	if(rightH == -1){
    		return -1;
    	}
    	if(Math.abs(leftH - rightH) > 1){
    		return -1;
    	}
    	return Math.max(leftH , rightH);
    }
}
