/*
 * File : Operation.java
 * Data : 17.10.2023
 * Goal :
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

package Matrix.Operations;

import Matrix.Matrix;

public abstract class Operation {
    public Matrix doOperation( Matrix a, Matrix b) {

        // Matrix are empty
        if(a == null || b == null ){
            throw new IllegalArgumentException("At least one matrix is empty.");
        }

        if(a.getModulo() != b.getModulo()){
            throw new IllegalArgumentException("Modulos are not the same.");
        }

        int cHeight = Math.max(a.getSizeHeight(), b.getSizeHeight());
        int cWidth = Math.max(a.getSizeWidth(), b.getSizeWidth());

        Matrix c = new Matrix(new int[cHeight][cWidth], a.getModulo());

        for(int row = 0; row < cHeight; row++){
            for (int column = 0; column < cWidth; column++){
                c.setMatrixAt(row, column, Math.floorMod(operation(a.getMatrixAt(row, column), b.getMatrixAt(row, column)), a.getModulo()));
            }
        }

        return c;
    }

    abstract int operation(int a, int b);
}
