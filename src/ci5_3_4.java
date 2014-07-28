/*
 *  Towers of Hanoi
 */
import java.util.*;

public class ci5_3_4 {
  
	public void moveHanoi(int index, Stack<Integer> source, Stack<Integer> dest, Stack<Integer> buffer){
		if(index == 1){
			dest.push(source.pop());
			return;
		}
		moveHanoi(index-1, source, buffer, dest);
		dest.push(source.pop());
		moveHanoi(index-1, buffer, dest, source);
	}
	
}
