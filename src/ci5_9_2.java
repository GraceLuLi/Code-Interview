/*
 *  Image a robot sitting on the upper left corner of an X by Y grid. The robot can only move in 
 *  two directions: right and down. How many possible paths are there for the robot to go from (0,0) to (X, Y)
 *  FOLLOW UP
 *  Image certain spots are "off limits", such that the robot cannot step on them
 */
public class ci5_9_2 {

	// Method 1: dynamic 
	/*
	public int getWays(int[][] board){
		int[][] records = new int[board.length][board[0].length];
		return getWaysHelper(0, 0, board.length, board[0].length, records);
	}
	public int getWaysHelper(int startX, int startY, int destX, int destY, int[][] records){
  	  if(startX == destX && startY == destY){
  		  records[startX][startY] = 0;
		  return 1;
	  }
  	  if(records[startX][startY] != -1){
  		  return records[startX][startY];
  	  }
  	  int ways = 0;
  	  if(startX < destX){
  		ways += getWaysHelper(startX+1, startY, destX, destY, records);
  	  }    	  
  	  if(startY < destY){
		  ways +=  getWaysHelper(startX, startY+1, destX, destY, records);
	  }
  	  records[startX][startY] = ways;
	  return ways;
  	  
	}*/
	// FOLLOW UP
	public int getWays(int[][] board){
		int[][] records = new int[board.length][board[0].length];
		// fill records with -1
		return getWaysHelper(0, 0, board.length, board[0].length, records);
	}
	public int getWaysHelper(int startX, int startY, int destX, int destY, int[][] records){
	  if(offLimit(startX, startY)){
		  return 0;
	  }
  	  if(startX == destX && startY == destY){
  		  records[startX][startY] = 1;
		  return 1;
	  }
  	  if(records[startX][startY] != -1){
  		  return records[startX][startY];
  	  }
  	  int ways = 0;
  	  if(startX < destX){
  		ways += getWaysHelper(startX+1, startY, destX, destY, records);
  	  }    	  
  	  if(startY < destY){
		  ways += getWaysHelper(startX, startY+1, destX, destY, records);
	  }
  	  records[startX][startY] = ways;
	  return ways;
  	  
	}
	public boolean offLimit(int i, int j){
		return false;
	}
}
