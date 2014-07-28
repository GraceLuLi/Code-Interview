import java.util.HashMap;

/*
 * write code to remove duplicates from an unsorted linked list
 * FOLLOW UP: what if a temporary buffer is not allowed
 */
public class ci5_2_1 {
	// Method1, with temporary buffer
	/*public static void removeDuplicates(LinkedListNode n){
		if(n == null || n.next == null){
			return;
		}
		HashMap<Integer, Boolean> checker = new HashMap<Integer, Boolean>();
		checker.put(n.data, true);
		LinkedListNode pre = n;
		LinkedListNode p = n.next;
		while(p != null){
			if(checker.containsKey(p.data)){
				pre.next = p.next;
			}
		    else{
				checker.put(p.data, true);
				pre = p;
			}
			p = p.next;
		}
	}*/
	// Method1, without temporary buffer
	public static void removeDuplicates(LinkedListNode n){
		if(n == null || n.next == null){
			return;
		}
		LinkedListNode curr = n;
		while(curr != null){
			LinkedListNode p1 = curr;
			LinkedListNode p2 = curr.next;
			while(p2 != null){
				if(p2.data == curr.data){
					p1.next = p2.next;
				}
				else{
					p1 = p1.next;
				}
				p2 = p2.next;
			}
			curr = curr.next;
		}
		
	}
	public static void main(String[] args){
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(1);
		LinkedListNode n3 = new LinkedListNode(1);
		LinkedListNode n4 = new LinkedListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		removeDuplicates(n1);
		LinkedListNode p = n1;
		while(p != null){
			System.out.print(p.data + " ");
			p = p.next;
		}
	}

}
