/*
 * File : Main.java
 * Data : 17.10.2023
 * Goal :
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

import Matrix.Matrix;
import Matrix.Operations.Operation;
import Matrix.Operations.Addition;
import Matrix.Operations.Subtraction;
import Matrix.Operations.Multiplication;


public class Main {
    public static void main(String[] args){

        int modulo = 5;

        Matrix one = new Matrix(new int[][]{{1, 3, 1, 1}, {3, 2, 4, 2},{1, 0, 1, 0}}, modulo);
        Matrix two = new Matrix(new int[][]{{1, 4, 2, 3, 2}, {0, 1, 0, 4, 2},{0, 0, 2, 0, 2}}, modulo);

        System.out.println("The modulo is " + modulo);

        System.out.println("one:\n" + one);
        System.out.println("Matrix two:\n" + two);

        Operation addition = new Addition();

        System.out.println("one + two:\n" + addition.doOperation(one, two));

        Operation subtraction = new Subtraction();

        System.out.println("one - two:\n" + subtraction.doOperation(one, two));

        Operation multiplication = new Multiplication();

        System.out.println("one x two:\n" + multiplication.doOperation(one, two));

    }
}