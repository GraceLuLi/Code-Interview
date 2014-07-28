/*
 *  given an infinite number of quaters(25 cents), dimes(10 cents), nickels(5 cents) and 
 *  pennies(1 cent), write code to calculate the number of ways of representing n cents
 */
public class ci5_9_8 { 
	
     public static int makeChanges(int n, int denom){
        int next_denom = 0;
    	switch(denom){
    	  case 25:
    		 next_denom = 10;
    		 break;
    	  case 10:
    		  next_denom = 5;
    		  break;
    	  case 5:
    		  next_denom = 1;
    		  break;
    	  case 1:
    		  return 1;	
    	}
    	int ways = 0;
    	for(int i = 0; i*denom < n; ++i){
    		ways += makeChanges(n-i*denom, next_denom);
    	}
    	return ways; 
     }
     public static void main(String[] args){
    	 int a = makeChanges(100, 25);
    	 System.out.println(a);
     }
}
