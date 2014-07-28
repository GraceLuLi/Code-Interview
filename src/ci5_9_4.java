/*
 *  write a method to return all subsets of a set
 */
import java.util.ArrayList;

public class ci5_9_4 {
	public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		getSubsetsHelper(set, 0, result);
		return result;
	}
	public void getSubsetsHelper(ArrayList<Integer> set, int index, ArrayList<ArrayList<Integer>> result){
		if(index >= set.size()){
			return;
		}
		int curr = set.get(index);
		for(ArrayList<Integer> pre : result){
			ArrayList<Integer> clone = (ArrayList<Integer>)pre.clone();
			clone.add(curr);
			result.add(clone);
		}
		getSubsetsHelper(set, index+1, result);
	}

}
