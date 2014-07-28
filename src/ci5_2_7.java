import java.util.Stack;

/*
 *  implement a function to check if a linked list is a palindrome
 */
public class ci5_2_7 {
	// Method 1: separate into two half parts, compare the first half with the second reversed half
    /* public static boolean isPalindrome(LinkedListNode n){
    	LinkedListNode p1 = n;
    	LinkedListNode p2 = n;
    	LinkedListNode pre = n;
    	if(p2 != null && p2.next != null){
    		pre = p1;
    		p1 = p1.next;
    		p2 = p2.next.next;
    	}
    	pre.next = null;  // separate the first half and second half
    	pre = p1;  // begin reverse the second half
    	while(p1.next != null){
    		p2 = p1.next;
    		p1.next = p2.next;
    		p2.next = pre;
    		pre = p2;
    	}
    	p1 = n;   // p1 is the first half's head and p2 is the second reversed half's head
    	while(p1 != null && p2 != null){ // compare two list
    		if(p1.data != p2.data){
    			return false;
    		}
    		p1 = p1.next;
    		p2 = p2.next;
    	}
    	return true;
     }*/
	// Method2: push the first half part into stack, compare the two parts in reversed order
	public static boolean isPalindrome(LinkedListNode n){
		Stack<Integer> s = new Stack<Integer>();
		LinkedListNode p1 = n;
		LinkedListNode p2 = n;
		while(p2 != null && p2.next != null){
			s.push(p1.data);
			p1 = p1.next;
			p2 = p2.next.next;
		}
		if(p2 != null){  // has odd number of elements, skip the middle element
			p1 = p1.next;
		}
		while(p1 != null){
			if(s.pop() != p1.data){
				return false;
			}
			p1 = p1.next;
		}
		return true;
	}
     public static void main(String[] args){
    	 LinkedListNode n1 = new LinkedListNode(1);
    	 LinkedListNode n2 = new LinkedListNode(1);
    	 LinkedListNode n3 = new LinkedListNode(1);
    	 LinkedListNode n4 = new LinkedListNode(2);
    	 LinkedListNode n5 = new LinkedListNode(1);
         n1.next = n2;
         n2.next = n3;
    	 System.out.print(isPalindrome(n1));
     }
}
