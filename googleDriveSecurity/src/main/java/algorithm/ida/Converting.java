package algorithm.ida;

import org.ejml.simple.SimpleMatrix;

/**
 * 
 * @author AIN this class used to 1) casting arrays to another types 2) convert
 *         2 Dimensional Array to 1D, and reverse (1D to 2D)
 */
public class Converting {
	/**
	 * 
	 * @param source
	 *            the 2D array of bytes
	 * @return 2D of double values
	 */
	public static double[][] catingTo2dDouble(byte[][] source) {
		double[][] dest = new double[source.length][source[0].length];
		for (int row = 0; row < source.length; row++) {
			for (int col = 0; col < source[row].length; col++) {
				dest[row][col] = (double) source[row][col];

			}

		}
		return dest;
	}

	/**
	 * 
	 * @param source
	 *            array of int values
	 * @return array of byte values
	 */
	public static byte[] castingTo1dByte(int[] source) {
		byte[] dest = new byte[source.length];

		for (int row = 0; row < source.length; row++) {
			dest[row] = (byte) source[row];
		}
		return dest;
	}

	/**
	 * 
	 * @param source
	 *            is a SimpleMatrix with Values of doubles (SimpleMatrix is from
	 *            the "ejml" Library)
	 * @return 2D of int values
	 */
	public static int[][] castingTo2dInt(SimpleMatrix source) {
		int[][] dest = new int[source.numRows()][source.numCols()];

		for (int row = 0; row < source.numRows(); row++) {
			for (int col = 0; col < source.numCols(); col++) {
				if (source.get(row, col) < 0) {
					dest[row][col] = (int) (Math.floor(source.get(row, col)));

				} else
					dest[row][col] = (int) (Math.ceil(source.get(row, col)));
			}
		}
		return dest;
	}

	/**
	 * 
	 * @param source
	 *            2D of int values
	 * @return 2D of double values
	 */
	public static double[][] castingTo2dDoubleFrom2dInt(int[][] source) {
		double[][] dest = new double[source.length][source[0].length];
		for (int row = 0; row < source.length; row++) {
			for (int col = 0; col < source[row].length; col++) {
				dest[row][col] = (double) source[row][col];

			}

		}
		return dest;
	}

	/**
	 * 
	 * @param array
	 *            2D array of int values
	 * @return 1D array of int values
	 */
	public static int[] convert2Dto1D(final int[][] array) {
		int rows = array.length, cols = array[0].length;
		int[] mono = new int[(rows * cols)];
		for (int i = 0; i < rows; i++)
			System.arraycopy(array[i], 0, mono, (i * cols), cols);
		return mono;
	}

	/**
	 * 
	 * @param array
	 *            1D array of int values
	 * @param rows
	 *            number of rows
	 * @param cols
	 *            number of cols
	 * @return 2D array of int values
	 */
	public static int[][] convert1Dto2D(final int[] array, final int rows, final int cols) {
		if (array.length != (rows * cols))
			throw new IllegalArgumentException("Invalid array length");

		int[][] bidi = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			System.arraycopy(array, (i * cols), bidi[i], 0, cols);
		}
		return bidi;
	}

}