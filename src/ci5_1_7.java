/*
 * write an algorithm such that if an element in an MxN matrix is 0
 * its entire row and column are set to 0
 */
public class ci5_1_7 {
	public void setZero(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[] rows = new boolean[m];
		boolean[] cols = new boolean[n];
		for(int i = 0; i < m ; ++i){
			for(int j = 0; j < n; ++j){
				if(matrix[i][j] == 0){
					rows[i] = true;
					cols[j] = false;
				}
			}
		}
		for(int i = 0; i < m ; ++i){
			for(int j = 0; j < n; ++j){
				if(rows[i]||cols[j]){
					matrix[i][j] = 0;
				}
			}
		}
	}
}
