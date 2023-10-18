/*
 * File : MatrixTest.java
 * Data : 17.10.2023
 * Goal : Test the Matrice class
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

package Matrix;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

    // Test new random matrice
    @Test
    public void testMatrix() {
        Matrix matrix = new Matrix(2, 3, 5);
        Assert.assertTrue(matrix.getMatrix()[1][1] < 5);
        Assert.assertFalse(matrix.getMatrix()[1][2] >= 5);
    }

    // Test new matrice from array
    @Test
    public void testMatriceFromArray() {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };
        Matrix matrix = new Matrix(array, 5);
        Assert.assertEquals(1, matrix.getMatrix()[0][0]);
        Assert.assertEquals(2, matrix.getMatrix()[0][1]);
        Assert.assertEquals(3, matrix.getMatrix()[0][2]);
        Assert.assertEquals(4, matrix.getMatrix()[1][0]);
        Assert.assertEquals(0, matrix.getMatrix()[1][1]);
        Assert.assertEquals(1, matrix.getMatrix()[1][2]);
    }

    // Test toString
    @Test
    public void testToString() {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };
        Matrix matrix = new Matrix(array, 5);
        Assert.assertEquals("1 2 3 \n4 0 1 \n", matrix.toString());
    }
}
