/*
 *  write a function to determine the number of bits required to covert integer A to integer B
 */
public class ci5_5_5 {
   public int convertNum(int A, int B){
	   int diff = A^B;
	   int count = 0;
	   while(diff > 0){
		   count +=  (diff & 1);
		   diff >>= 1;
	   }
	   return count;
   }
}
