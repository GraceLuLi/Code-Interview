/*
 *  given a sorted(increasing order) array with unique integer elements, write an algorithm to 
 *  create a binary search tree with minimal height
 */
public class ci5_4_3 {
    public TreeNode createTree(int[] arr){
    	return createTreeHelper(arr, 0 , arr.length-1);
    }
    public TreeNode createTreeHelper(int[] arr, int start, int end){
    	if(start > end){
    		return null;
    	}
    	int mid = (start + end)/2;
    	TreeNode n = new TreeNode(arr[mid]);
    	n.left = createTreeHelper(arr, start, mid-1);
    	n.right = createTreeHelper(arr, mid+1, end);
    	return n;
    }
}
