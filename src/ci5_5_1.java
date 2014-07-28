/*
 *  given two 32-bit numbers, N and M, and two bit positions, i and j .
 *  write a method to insert M into N that M starts at bit j and ends at bit i
 */
public class ci5_5_1 {
	public int  insertBits(int M, int N, int i, int j){
		int allOnes = ~0; // 1111111111
		int left = (allOnes << (j +1)); // 11100000 add (j + 1) 0s at the end;
		int right = (1 << i); // 100
		right ^= allOnes; //111^100 = 011 or right -= 1;
		int marker = (left | right);//1110000011: bit position 2-4 is zero
		N &= marker; // clean N's bit from position 2 to 4
		M <<= i; // move M to right place
		return N |= M;			
	}
}
