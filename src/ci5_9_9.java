/*
 *  print all ways of arranging eight queens on an 8x8 chess board, so that none of them share the 
 *  same row, column or diagonal
 */
public class ci5_9_9 {
    public static void eightQueens(int[] cols, int[] re){
    	eightQueensHelper(cols, 0, re);
    }
    public static void eightQueensHelper(int[] cols, int index, int[] re){ // cols[i] = j means: in row i , the queen is in column j
    	if(index == cols.length){
    		re[0]++; 
    		System.out.print("\n board: ");
    		printBoard(cols);
    		return;
    	}
    	for(int i = 0; i < cols.length; ++i){
    		if(isValid(cols, index, i)){
    			cols[index] = i;
    			eightQueensHelper(cols, index+1, re);
    		}
    	} 	
    }
    public static boolean isValid(int[] cols, int index, int val){
    	for(int i = 0; i < index; ++i){
    		if(cols[i] == val|| Math.abs(cols[i]-val) == Math.abs(i-index)){
    			return false;
    		}
    	}
    	return true;
    }
    public static void printBoard(int[] cols){
    	for(int i = 0; i < cols.length; ++i){
    		int v = cols[i];
    		System.out.println();
    		for(int j = 0; j < v; ++j){
    			System.out.print(" ");
    		}
    		System.out.print(v);
    		for(int j = v+1; j < cols.length; ++j){
    			System.out.print(" ");
    		}
    	}
    }
    public static void main(String[] args){
    	int[] re = new int[]{0};
    	int[] cols = new int[8];
    	eightQueens(cols,re);
    	System.out.println(re[0]);
    }
}
