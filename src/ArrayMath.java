/**
 * Some linear algebra methods, for testing.
 * 
 * @author Jim
 *
 */
public class ArrayMath {

	/**
	 * Compute dot product of two vectors.
	 * The vectors must have the same length.
	 * 
	 * @param x first vector to multiply
	 * @param y second vector to multiply
	 * @return dot-product of x and y
	 * @throws IllegalArgumentException if x and y are not arrays of the same size
	 */
	public static double dotProduct(double[] x, double[] y) {
		if (x.length != y.length) throw new IllegalArgumentException("Vector lengths must be same");
		int size = x.length;
		double product = 0.0;
		for (int k = 0; k < size; k++) {
			product += x[k]*y[k];
		}
		return product;
	}
	
	/**
	 * Perform scalar a times vector x plus y.
	 * @return the vector result a*x[] + y[]
	 */
	public static double[] saxpy(double a, double[] x, double[] y) {
		if (x.length != y.length)
			throw new IllegalArgumentException("Vector lengths must be same.");
		int len = x.length;
		double[] result = new double[len];
		for(int k=0; k<len; k++) {
			result[k] = a*x[k] + y[k];
		}
		return result;
	}
	
	/**
	 * Sum the squares of elements in an array7
	 * @param x the array to sum, may be empty
	 * @return the sum of squares in x
	 */
	public static double sumSquares(double[] x) {
		return 0.0;
	
	}
}
