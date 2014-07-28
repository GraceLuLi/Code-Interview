/*
 * implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node
 */
public class ci5_2_3 {
    public boolean removeNode(LinkedListNode n){
    	if(n == null || n.next == null){
    		return false;
    	}
    	LinkedListNode next = n.next;
    	n.data = next.data;
    	n.next = next.next;
        return true;
    }
}
