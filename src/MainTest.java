/*
 * File : MainTest.java
 * Data : 17.10.2023
 * Goal : Test the Main class
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

import Matrix.Matrix;
import Matrix.Operations.Addition;
import Matrix.Operations.Multiplication;
import Matrix.Operations.Operation;
import Matrix.Operations.Subtraction;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMatrixAddition() {
        Matrix one = new Matrix(new int[][]{{1, 3, 1, 1}, {3, 2, 4, 2},{1, 0, 1, 0}}, 5);
        Matrix two = new Matrix(new int[][]{{1, 4, 2, 3, 2}, {0, 1, 0, 4, 2},{0, 0, 2, 0, 2}}, 5);

        Operation addition = new Addition();

        Assert.assertEquals("2 2 3 4 2 \n3 3 4 1 2 \n1 0 3 0 2 \n", addition.doOperation(one, two).toString());
    }

    @Test
    public void testMatrixSubstraction(){
        Matrix one = new Matrix(new int[][]{{1, 3, 1, 1}, {3, 2, 4, 2},{1, 0, 1, 0}}, 5);
        Matrix two = new Matrix(new int[][]{{1, 4, 2, 3, 2}, {0, 1, 0, 4, 2},{0, 0, 2, 0, 2}}, 5);

        Operation substraction = new Subtraction();

        Assert.assertEquals("0 4 4 3 3 \n3 1 4 3 3 \n1 0 4 0 3 \n", substraction.doOperation(one, two).toString());
    }

    @Test
    public void testMatrixMultiplication(){
        Matrix one = new Matrix(new int[][]{{1, 3, 1, 1}, {3, 2, 4, 2},{1, 0, 1, 0}}, 5);
        Matrix two = new Matrix(new int[][]{{1, 4, 2, 3, 2}, {0, 1, 0, 4, 2},{0, 0, 2, 0, 2}}, 5);

        Operation multiplication = new Multiplication();

        Assert.assertEquals("1 2 2 3 0 \n0 2 0 3 0 \n0 0 2 0 0 \n", multiplication.doOperation(one, two).toString());
    }
}
