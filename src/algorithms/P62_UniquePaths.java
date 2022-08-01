package algorithms;

public class P62_UniquePaths {

	  public int uniquePaths(int m, int n) {
	        int[][][] ret = new int[m + n - 1][m][n];
	        ret[0][0][0] = 1;
	        for (int length = 1; length < m + n - 1; length++) {
	            for (int zeroes = 0; zeroes < m; zeroes++) {
	                for (int ones = 0; ones < n; ones++) {
	                    ret[length][zeroes][ones] = 0;
	                    if (zeroes > 0) {
	                        ret[length][zeroes][ones] += ret[length - 1][zeroes - 1][ones];
	                    }
	                    if (ones > 0) {
	                        ret[length][zeroes][ones] += ret[length - 1][zeroes][ones - 1];
	                    }
	                }
	            }
	        }
	        return ret[m + n - 2][m - 1][n - 1];
	    }
	  
}
