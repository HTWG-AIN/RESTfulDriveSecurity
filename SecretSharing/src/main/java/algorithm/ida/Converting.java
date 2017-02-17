package algorithm.ida;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

import org.ejml.simple.SimpleMatrix;

import lib.finiteFieldLibrary.Matrix;

 

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

	public static int[][] castingFromByteToInt(byte[][] source) {
		int[][] dest = new int[source.length][source[0].length];
		for (int row = 0; row < source.length; row++) {
			for (int col = 0; col < source[row].length; col++) {
				dest[row][col] = (int) (source[row][col] & 0xff ); 

			}

		}
		return dest;
	}
	public static long[][] catingTo2dLong(int[][] source) {
		long[][] dest = new long[source.length][source[0].length];
		for (int row = 0; row < source.length; row++) {
			for (int col = 0; col < source[row].length; col++) {
				dest[row][col] = (long) source[row][col];

			}

		}
		return dest;
	}

	public static long[][] catingTo2dLongFromInt(int[][] source) {
		long[][] dest = new long[source.length][source[0].length];
		for (int row = 0; row < source.length; row++) {
			for (int col = 0; col < source[row].length; col++) {
				dest[row][col] = (long) source[row][col];

			}

		}
		return dest;
	}

	public static int[][] catingTo2dLongFromInt(Matrix source) {
		int[][] dest = new int[source.getRows()][source.getColumns()];
		for (int row = 0; row < source.getRows(); row++) {
			for (int col = 0; col < source.getColumns(); col++) {
				dest[row][col] = (int) source.getElement(row, col);

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

	public static byte[][] castingTo2dByte(SimpleMatrix source) {
		byte[][] dest = new byte[source.numRows()][source.numCols()];

		for (int row = 0; row < source.numRows(); row++) {
			for (int col = 0; col < source.numCols(); col++) {
				if (source.get(row, col) < 0) {
					dest[row][col] = (byte) (Math.floor(source.get(row, col)));

				} else
					dest[row][col] = (byte) (Math.ceil(source.get(row, col)));
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
			// System.out.println(Arrays.deepToString(dest));

		}
		return dest;
	}
	
	public static double[][] castingTo2dDoubleFrom2dLong(int[][] is) {
		double[][] dest = new double[is.length][is[0].length];
		for (int row = 0; row < is.length; row++) {
			for (int col = 0; col < is[row].length; col++) {
				dest[row][col] = (double) is[row][col];

			}
			// System.out.println(Arrays.deepToString(dest));

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

	public static double[] convert2Dto1DDouble(final double[][] array) {
		int rows = array.length, cols = array[0].length;
		double[] mono = new double[(rows * cols)];
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

	 
public static void main(String[] args) throws Exception{
//as	FileSplitter.splitMyOriginalFileIntoSlices(new File("D:/TEST/testen.txt"), 4, 2);
}
	 
 
 
	 
}