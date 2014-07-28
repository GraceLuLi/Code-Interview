import java.util.Stack;

/*
 *  Design a stack which, in addition to push and pop, also has a function min which returns 
 *  the minimum element
 */
public class ci5_3_2 {
	public class StackWithMin extends Stack<Integer>{
		Stack<Integer> minStack;
		StackWithMin(){
			minStack = new Stack<Integer>();
		}
		public void push(int val){
			super.push(val);
			if(val <= min()){
				minStack.push(val);
			}
		}
		public Integer pop(){
			int val = (int) super.pop();
			if(val == min()){
				minStack.pop();
			}
			return val;
		}

		public boolean isEmpty(){
			return super.isEmpty();
		}
		public int min(){
			if(minStack.isEmpty()){
				return Integer.MAX_VALUE; // warning
			}
			else return minStack.peek();
		}
	}
}
