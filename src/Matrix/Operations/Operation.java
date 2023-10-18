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
        if(a == null || b == null ){
            throw new Exception("At least one matrix is empty.");
        }

        if(modulo <= 0){
            throw new Exception("Modulo must be greater than 0.");
        }

        int cHeight = Math.max(a.getSizeHeight(), b.getSizeHeight());
        int cWidth = Math.max(a.getSizeWidth(), b.getSizeWidth());

        Matrix c = new Matrix(new int[cHeight][cWidth]);

        for(int row = 0; row < cHeight; row++){
            for (int column = 0; column < cWidth; column++){
                c.setMatrixAt(row, column, Math.floorMod(operation(a.getMatrixAt(row, column), b.getMatrixAt(row, column)), modulo));
            }
        }

        return c;
    }

    abstract int operation(int a, int b);
}
