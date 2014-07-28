/*
 * given an image represented by an NxN matrix, write a method to rotate the image by 90 degrees
 * do this in place
 */
public class ci5_1_6 {
	public void rotateImage(int[][] image, int n){
		for(int level = 0; level < n/2; ++level){
			int start = level;
			int end = n - 1 - level;
			for(int i = start; i < end; ++i){
				int dist = i - start;
				// save top value 
				int top = image[start][i];
				// put left value in top
				image[start][i] = image[end-dist][start];
				// put bottom value to left
				image[end-dist][start] = image[end][end-dist];
				//put right value to bottom
				image[end][end-dist] = image[i][end];
				//put top value to right
				image[i][end] = top;
			}
		}
	}

}
