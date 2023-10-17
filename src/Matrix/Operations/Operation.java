/*
 * File : Operation.java
 * Data : 17.10.2023
 * Goal :
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

package Matrix.Operations;

import Matrix.Matrix;

public abstract class Operation {
    public Matrix doOperation( Matrix a, Matrix b, int modulo) throws Exception {

        // Height and width of the two matrix aren't the same
        if(a.getSizeWidth() != b.getSizeWidth() || a.getSizeHeight() != b.getSizeHeight()){
            throw new Exception("Matrix aren't the same size.");
        }

        Matrix c = new Matrix(new int[a.getSizeHeight()][a.getSizeWidth()]);

        for(int row = 0; row < a.getSizeHeight(); row++){
            for (int column = 0; column < a.getSizeWidth(); column++){
                c.setMatrixAt(row, column, op(a.getMatrixAt(row, column), b.getMatrixAt(row, column)) % modulo);
            }
        }

        return c;
    }

    abstract int op(int a, int b);
}
