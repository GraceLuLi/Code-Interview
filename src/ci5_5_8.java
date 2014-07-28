/*
 *  drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y)
 */
public class ci5_5_8 {
	  public void drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y){
		  int rowBeginIndex = width*y;
		  int wholeLineStart = rowBeginIndex + x1/8;
		  int offSetLeft = 8-x1%8;
		  int wholeLineEnd = rowBeginIndex + x2/8;
		  int offSetRight =8 - x2%8;
		  
		  for(int i = wholeLineStart; i <= wholeLineEnd; ++i){
			  screen[i] = (byte)0xFF;
		  }
		  int leftMask = (1<< (offSetLeft+1)) - 1;
		  screen[wholeLineStart] &= leftMask;
		  int allOnes = ~0;
		  int rightMask = (allOnes << offSetRight);
		  screen[wholeLineEnd+1] &= rightMask;	  
	  }
}
