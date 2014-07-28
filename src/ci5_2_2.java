/*
 * implement an algorithm to find the kth to last element of a singly linked list
 */
// questions: find the value or node? if value, what if node not exits?
public class ci5_2_2 {
     public LinkedListNode findKthToLast(LinkedListNode n, int k){
    	 // question: k == 0, return null or the last element
    	 // in solution of coding interview, return null, but in mine, return last element
    	 if(n == null){
    		 return null;
    	 }
    	 LinkedListNode p1 = n;
    	 LinkedListNode p2 = n;
    	 while(p2 != null && k != 0){
    		 p2 = p2.next;
    		 --k;
    	 }
    	 if(p2 == null){
    		 return null;
    	 }
    	 while(p2.next != null){
    		 p1 = p1.next;
    		 p2 = p2.next;
    	 }
    	 return p1;
     }
}
