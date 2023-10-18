package Matrix;/*
 * File : Operation.java
 * Data : 17.10.2023
 * Goal : Class to encapsulate a matrice
 * Authors : Rodrigo Lopes dos Santos, Urs Behrmann
 */

public class Matrix {
    private int[][] matrix;

    // Constructor
    public Matrix(int height, int width, int modulo) {
        this.matrix = new int[height][width];
        java.util.Random random = new java.util.Random();
        for(int[] i : matrix){
            for(int j : i){
                j = random.nextInt(modulo);
            }
        }
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /*
     * Getter of the encapsulated value
     * @return the value of the encapsulated value
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /*
     * Render a representation of the current object in the form of a String object
     */
    public String toString() {
        String result = "";
        for (int[] i : matrix) {
            for (int j : i) {
                result += j + " ";
            }
            result += "\n";
        }
        return result;
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
