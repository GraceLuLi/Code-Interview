import java.util.Arrays;

/*
 *  A child is running up a staircase with n steps, and hop either 1 step, 2 steps, or 3 steps at a time
 *  Implement a method to count how many possible ways the child can run up the stairs
 */
public class ci5_9_1 {
	/* Method 1, recursive
      public int runStairs(int n){
    	  if(n < 0){
    		  return 0;
    	  }
    	  if(n == 0){
    		  return 1;
    	  }
    	  return runStairs(n-1) + runStairs(n-2)+ runStairs(n - 3);
      }
      */
	// Method 2, dynamic programming
      public int runStairs(int n){
    	  int[] arr = new int[n];
    	  Arrays.fill(arr, -1);
    	  return runStairsHelper(n, arr);
      }
      public int runStairsHelper(int n, int[] arr){
    	  if(n < 0){
    		  return 0;
    	  }
    	  if(n == 0){
    		  return 1;
    	  }
    	  if(arr[n] != -1){
    		  return arr[n];
    	  }
    	  arr[n] = runStairsHelper(n-1, arr) + runStairsHelper(n-2, arr)+ runStairsHelper(n - 3, arr);   	  
    	  return arr[n];
      }
}
