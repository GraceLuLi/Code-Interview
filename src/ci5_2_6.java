/*
 *  given a circular linked list, implement an algorithm which returns the node at the
 *  beginning of the loop
 */
public class ci5_2_6 {
      public LinkedListNode findBeginning(LinkedListNode head){
    	  
    	  LinkedListNode p1 = head;
    	  LinkedListNode p2 = head;
    	  
    	  while(p2 != null && p2.next != null){
    		  p1 = p1.next;
    		  p2 = p2.next.next;
    		  if(p1 == p2){
    			  break;
    		  }
    	  }
    	  if(p2 != null && p2.next != null){
    		  return null; // it has not circle
    	  }
    	  p1 = head;
    	  while(p1 != p2){
    		  p1 = p1.next;
    		  p2 = p2.next;
    	  }
    	  return p1;
      }
}
