/*
 *  partition a linked list around a value x, such that all nodes less than x come before all nodes 
 *  greater than or equal to x
 */
public class ci5_2_4 {
	public LinkedListNode partition(LinkedListNode head, int x){
		if(head == null || head.next == null){
			return head;
		}
		LinkedListNode p1 = null;
		LinkedListNode p2 = null;
		LinkedListNode h1 = null;
		LinkedListNode h2 = null;
        
		LinkedListNode p = head;
		while(p != null){
			LinkedListNode next = p.next;
			p.next = null;  // important
			if(p.data < x){
				if(p1 == null){
					h1 = p;
				}
				else{
					p1.next = p;
				}
				p1 = p;
			}
			else{
				if(p2 == null){
					h2 = p;
				}
				else{
					p2.next = p;
				}
				p2 = p;
			}
			p = next;
		}
		if(h1 == null){
			return h2;
		}
		
		p1.next = h2;
		return h1;
	}

}
