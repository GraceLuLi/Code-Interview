/*
 *  swap odd and even bits in an integer with as few instructions as possible
 */
public class ci5_5_6 {
   public int swapBits(int num){
	   int odd = ((0x55555555 & num) << 1);
	   int even = ((0xaaaaaaaa & num) >>1);
	   return odd|even; 
   }
}
