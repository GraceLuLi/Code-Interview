/*
 *  Implement a MyQueue class which implements a queue using two stacks
 *  Stack: push pop peek isEmpty size
 *  Queue: add  remove peek isEmpty size
 */
import java.util.Stack;
public class ci5_3_5 {
	public class MyQueue{
		Stack<Integer> s1;
		Stack<Integer> s2;
		MyQueue(){
			s1 = new Stack<Integer>();
			s2 = new Stack<Integer>();
		}
		void add(int val){
			s1.push(val);
		}
		int remove(){
			int val = s2.peek();
			s2.pop();
			return val;
		}
		int peek(){
			if(!s2.isEmpty()){
				return s2.peek();
			}
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			return s2.peek();
		}
		boolean isEmpty(){
			return size() == 0;
		}
		int size(){
			return s1.size() + s2.size();
		}
	}

}
