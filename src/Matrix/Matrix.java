/*
 * File : Matrix.java
 * Data : 17.10.2023
 * Goal : Class to encapsulate a matrice
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

package Matrix;

public class Matrix {
    private final int[][] matrix;
    private final int modulo;

    // Constructor
    public Matrix(int height, int width, int modulo) {
        this.matrix = new int[height][width];
        this.modulo = modulo;

        java.util.Random random = new java.util.Random();

        for(int[] row : matrix){
            for(int element : row){
                element = random.nextInt(modulo);
            }
        }
    }

    public Matrix(int[][] matrix, int modulo) {
        this.matrix = matrix;
        this.modulo = modulo;

        for (int[] row : matrix){
            for (int element : row){
                element = Math.floorMod(element, modulo);
            }
        }
    }

    /*
     * Getter of the encapsulated value
     * @return the value of the encapsulated value
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /*
     * Getter of the modulo
     */
    public int getModulo() {
        return modulo;
    }

    /*
     * Render a representation of the current object in the form of a String object
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] i : matrix) {
            for (int j : i) {
                result.append(j).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    /*
     * Getter of the height of the matrix
     * @return the height of the matrix
     */
    public int getSizeHeight(){
        return matrix.length;
    }

    /*
     * Getter of the width of the matrix
     * @return the width of the matrix
     */
    public int getSizeWidth(){
        return matrix[0].length;
    }

    public int getMatrixAt(int row, int column) {
        if(row >= matrix.length || column >= matrix[0].length){
            return 0;
        }
        return matrix[row][column];
    }

    public void setMatrixAt(int row, int column, int value) {
        matrix[row][column] = value;
    }
}
