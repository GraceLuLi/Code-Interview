/*
 *  given an MxN matrix in which each row and each column is sorted in ascending order
 *  write a method to find an element
 */
public class ci5_11_6 {
   public boolean findElement(int[][] matrix, int val){
	   int i = 0;
	   int j = matrix[0].length-1;
	   while(i < matrix.length && j >=0){
		   int curr = matrix[i][j];
		   if(curr == val){
			   return true;
		   }
		   if(curr > val){
			   j--;
		   }
		   else{
			   i++;
		   }
	   }
	   return false;
   }
}
