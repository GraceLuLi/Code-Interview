import java.util.ArrayList;
import java.util.Stack;

/*
 *  implement class SetOfStacks with push(), pop(),peek(), isEmpty(), popAt()
 */
public class ci5_3_3 {
    public class SetOfStacks{
    	ArrayList<Stack<Integer>> list;
    	int threshold;
    	int currStackSize;
    	int stackNum;
    	SetOfStacks(int thres){
    		threshold = thres;
    		currStackSize = 0;
    		list = new ArrayList<Stack<Integer>>();
    		list.add(new Stack<Integer>());
    	}
    	void push(int val){
    		if(currStackSize == threshold){
    			Stack<Integer> s = new Stack<Integer>();
    			s.push(val);
    			list.add(s);
    			currStackSize = 1;
    		}
    		else{
    			Stack<Integer> s = list.get(list.size()-1);
    			s.push(val);
    			++currStackSize;
    		}
    	}
    	int pop(){
    		Stack<Integer> s = list.get(list.size()-1);
    		int val = s.pop();
    		if(--currStackSize == 0){
    			list.remove(list.size()-1);
    		}
    		return val;
    	}
    	boolean isEmpty(){
    		return (list.get(0)).isEmpty();
    	}
    	int popAt(int index){
    		Stack<Integer> s = list.get(index);
    		int val = s.pop();
    		leftShift(index);
    		return val;
    	}
    	void leftShift(int index){
    		Stack<Integer> s1 = list.get(index);
    		Stack<Integer> tmp = new Stack<Integer>();
    		Stack<Integer> s2;
    		while(index < list.size()-1){
    			s2 = list.get(index+1);
    			while(!s2.isEmpty()){
    				tmp.push(s2.pop());
    			}
    			s1.push(tmp.pop());
    			while(!tmp.isEmpty()){
    				s2.push(tmp.pop());
    			}
    			s1 = s2;
    			++index;
    		}
    		if(list.get(index).isEmpty()){
    			list.remove(index);
    		}
    		
    	}
    }
}
