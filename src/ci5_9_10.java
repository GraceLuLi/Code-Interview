/*
 *  a stack of n boxes, with widths Wi, heights Hi, and depth Di. the boxes can only be stacked on top of
 *  one another if each box in the stack is strictly larger than the box above in width, height, and depth
 *  Implement a method to build the tallest stack possible
 */
import java.util.ArrayList;
import java.util.HashMap;
public class ci5_9_10 {
    public ArrayList<Box> createStack(Box[] boxes){
    	HashMap<Box,ArrayList<Box>> stackMap = new HashMap<Box,ArrayList<Box>>();
    	ArrayList<Box> Max_Stack = new ArrayList<Box>();
    	int Max_Height = 0;
    	for(int i = 0; i < boxes.length; ++i){
    		ArrayList<Box> tmpStack = createStackDP(boxes, boxes[i], stackMap);
    		int this_height = 0;
	    	for(Box b : tmpStack){
	    		this_height += b.h;
	    	}
	    	if(this_height > Max_Height){
	    		Max_Height = this_height;
	    		Max_Stack = tmpStack;
	    	}
    	}
   	   return Max_Stack;
    }
     public ArrayList<Box> createStackDP(Box[] boxes, Box bottom, HashMap<Box,ArrayList<Box>> stackMap){
    	 if(stackMap.containsKey(bottom)){
    		 return stackMap.get(bottom);
    	 }   	 
    	 int Max_Height = 0;
    	 ArrayList<Box> Max_Stack = new ArrayList<Box>();
    	 for(int i = 0; i < boxes.length; ++i){
    		 if(boxes[i].canAbove(bottom)){
    	    	ArrayList<Box> preStack = createStackDP(boxes, boxes[i], stackMap);
    	    	int this_height = bottom.h;
    	    	for(Box b : preStack){
    	    		this_height += b.h;
    	    	}
    	    	if(this_height > Max_Height){
    	    		Max_Height = this_height;
    	    		Max_Stack = preStack;
    	    	}
    		 }

    	 }
    	 Max_Stack.add(bottom);
    	 stackMap.put(bottom, Max_Stack);
    	 return (ArrayList<Box>)Max_Stack.clone();
     }
}
