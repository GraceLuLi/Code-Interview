/*
 *  Sort a stack in ascending order(with biggest items on top)
 *  may use at most one additional stack to hold items, but may not copy the elements into any other 
 *  data structure(such as an array)
 *  stack supports these operations: push pop peek isEmpty
 */
import java.util.Stack;
public class ci5_3_6 {
	public void sortStack(Stack<Integer> s){
		Stack<Integer> s2 = new Stack<Integer>();
		while(!s.isEmpty()){
			int val = s.pop();
			while(!s2.isEmpty() && s2.peek() > val){
				s.push(s2.pop());
			}
			s2.push(val);
		}
		s = s2;
	}

}
