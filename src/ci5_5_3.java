/*
 *  given a positive integer, print the next smallest and the next largest number that have the
 *  same number of 1 bits in their binary representation
 */
public class ci5_5_3 {
	public int getBit(int num, int position){
		return (num &(1<< position)) == 0? 0 : 1;
	}
	public int findNextSmallest(int num){
		/* 1. find the first 0 before 1, trun on it
		 * 2. turn off the 1 right after it
		 * 3. move all the 1s to right, make it smallest
		 */
		int i = 0;
		while(getBit(num, i) == 0){ // find first 1
			++i;
		}
		int countOnes = 0;
		while(getBit(num, i) == 1){ // find first 0 before 1
			++countOnes;
			++i;
		}
		num |= (1<<i); // turn on the 0
		int allOnes = ~0; 
		int mask = ( allOnes << i); 
		num &= mask; // clean every thing at the end to 0, then add ones
		int ones = (1 << countOnes) -1;
		num |= ones;
		return num;
		
	}

}
