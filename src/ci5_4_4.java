/*
 * given a binary tree, design an algorithm which creates a linked list of all the nodes at
 * each depth (e.g., tree with depth D, there are D linked lists)
 */
import java.util.*;

public class ci5_4_4 {
   public static ArrayList<LinkedList<TreeNode>> createLinkedLists(TreeNode root){
	   ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
	   LinkedList<TreeNode> preLevel = new LinkedList<TreeNode>();
	   if(root == null){
		   return result;
	   }
	   preLevel.add(root);
	   result.add(preLevel);
	   createLevelLinkedList(preLevel, result);
	   return result;
   }
   public static void createLevelLinkedList(LinkedList<TreeNode> preLevel, ArrayList<LinkedList<TreeNode>> result){
	   LinkedList<TreeNode> currLevel = new LinkedList<TreeNode>();
	   for(TreeNode n: preLevel){
		   if(n.left != null){
			   currLevel.add(n.left);
		   }
		   if(n.right != null){
			   currLevel.add(n.right);
		   }
	   }
	   if(currLevel.size() == 0){
		   return;
	   }
	   else{
		   result.add(currLevel);
		   createLevelLinkedList(currLevel, result);
	   }
   }
 public static void main(String[] args){
	   
	   TreeNode node0 = new TreeNode(0);
	   TreeNode node1 = new TreeNode(1);
	   TreeNode node2 = new TreeNode(2);
	   TreeNode node3 = new TreeNode(3);
	   TreeNode node4 = new TreeNode(4);
	   TreeNode node5 = new TreeNode(5);
	   TreeNode node6 = new TreeNode(6);
	   
	   node3.left = node1;
	   node3.right = node5;
	   node1.left = node0;
	   node1.right = node2;
	   node5.left = node4;
	   node5.right = node6;
	   
	   TreeNode root = node3;
	   ArrayList<LinkedList<TreeNode>> result = createLinkedLists(root);
	   
	   for(int level=0; level< result.size(); level++)
	   {
		   LinkedList<TreeNode> list = result.get(level);
		   System.out.print("level "+level+":  ");
		   for(int i=0; i<list.size(); i++)
		   {
			   System.out.print(list.get(i).val +" ");
		   }
		   System.out.println();
	   }

   }
}
