/*
 *  you have two numbers represented by a linked list, 1's digit is at the head of the list
 *  write a function that adds the two numbers and returns the sum as a linked list
 *  FOLLOW UP
 *  suppose the digits are stored in forward order. Repeat the above problem
 */
public class ci5_2_5 {
	/*
      public LinkedListNode addNumbers(LinkedListNode n1, LinkedListNode n2){
    	  return addNumbersHelper(n1, n2, 0);
      }
      public LinkedListNode addNumbersHelper(LinkedListNode n1, LinkedListNode n2, int carry){
    	  if(n1 == null && n2 == null){
    		  if(carry == 0){
    			  return null;
    		  }
    		  return new LinkedListNode(carry);
    	  }
     
    	  int sum = carry;
    	  if(n1 != null){
    		  sum += n1.data;
    	  }
    	  if(n2 != null){
    		  sum += n2.data;
    	  }
    	  LinkedListNode n = new LinkedListNode(sum%10);
    	  n.next = addNumbersHelper(n1 == null? null:n1.next, 
    			                    n2 == null? null:n2.next, sum/10);
    	  return n;
      }*/
	// FOLLOW UP
}
