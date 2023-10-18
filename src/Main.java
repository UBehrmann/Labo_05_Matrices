/*
 * File : Operation.java
 * Data : 17.10.2023
 * Goal :
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

import Matrix.Matrix;
import Matrix.Operations.Operation;
import Matrix.Operations.Addition;


public class Main {
    public static void main(String[] args){

        Matrix one = new Matrix(new int[][]{{1, 3, 1, 1}, {3, 2, 4, 2},{1, 0, 1, 0}});
        Matrix two = new Matrix(new int[][]{{1, 4, 2, 3, 2}, {0, 1, 0, 4, 2},{0, 0, 2, 0, 2}});

        System.out.println("Matrix one:\n" + one.toString());
        System.out.println("Matrix two:\n" + two.toString());

        Operation addition = new Addition();

        try{
            System.out.println("Matrix one + Matrix two:\n" + addition.doOperation(one, two, 5).toString());
        }catch (Exception e){
            System.out.println(e.toString());
        }


    }
}