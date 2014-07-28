/*
 *  describe how you could use a single array to implement three stacks
 */
public class ci5_3_1 {
	// Method 1 , fixed division
	/*int size = 100;
    int[] aArray = new int[size*3];
    int[] pointer = new int[]{-1,-1,-1};
    
    void push(int val, int stackNum) throws Exception{ //push to stackNum which range from 0 to 2
    	if(pointer[stackNum]+1 >= size){
    		throw new Exception("out of space");
    	}
    	int index = stackNum*100 + pointer[stackNum] + 1;
    	aArray[index] = val;
    	++pointer[stackNum];
    }
    int top(int stackNum) throws Exception{
    	if(pointer[stackNum] == -1){
    		throw new Exception("it is an empty stack");
    	}
    	int index = stackNum*100 + pointer[stackNum];
    	return aArray[index];
    }
    int pop(int stackNum)throws Exception{
    	if(pointer[stackNum] == -1){
    		throw new Exception("pop from empty stack");
    	}
    	int index = stackNum*100 + pointer[stackNum];
    	--pointer[stackNum];
    	return aArray[index];
    }
    boolean isEmpty(int stackNum){
    	return pointer[stackNum] == -1;
    }
    */
	// Method2. Flexiable division
	int size = 100;
	int[] aArray = new int[size*3];
	
	
    
}
