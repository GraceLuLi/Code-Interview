import java.util.ArrayList;

/*
 *  An array A contains all the integers from 0 to n, except for one num which is missing
 * we cannot access an entire integer in A, the only operation we can use to access them is 
 * "fetch the jth bit of A[i]"
 * Try to find the missing num in O(n) time
 */
public class ci5_5_7 {
	public static int getBit(int num, int bitIndex){
		return (num &(1<< bitIndex)) == 0? 0 : 1;
	}
	public static int findMissingNum(ArrayList<Integer> arr, int n){
		int integerSize = 0;
		while(n > 0){
			n /= 2;
			++integerSize;
		}
        return findNumHelper(arr, 0,integerSize);
	}
	public static int findNumHelper(ArrayList<Integer> arr,int column, int integerSize){
		if(column > integerSize){
			return 0;
		}
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> zeros = new ArrayList<Integer>();
		for(int num : arr){
			if(getBit(num, column) == 1){
				ones.add(num);
			}
			else{
				zeros.add(num);
			}
		}
		if(ones.size() >= zeros.size()){
			int val = findNumHelper(zeros, column+1, integerSize);
			return (val<<1)|0;
		}
		else{
			int val = findNumHelper(ones, column+1, integerSize);
			return (val<<1)|1;
		}
		
	}
   public static void main(String[] args){
	   ArrayList<Integer> arr = new ArrayList<Integer>();
	   arr.add(0); arr.add(2); arr.add(3); arr.add(1); arr.add(5);
	   System.out.println(findMissingNum(arr, 5));
   }
}
