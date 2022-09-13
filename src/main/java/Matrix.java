import java.util.Random;
public class Matrix {
    private final int matrixColumn, matrixLine;
    private final int[][] matrixArr;
    public Matrix(int matrixColumn, int matrixLine) {
        Random random = new Random();
        matrixArr = new int[matrixColumn][matrixLine];
        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                set(i, j, random.nextInt(10));
            }
        }
        this.matrixColumn = matrixColumn;
        this.matrixLine = matrixLine;
    }
    public int get(int matrixColumn, int matrixLine) {
        return matrixArr[matrixColumn][matrixLine];
    }
    public void set(int matrixColumn, int matrixLine, int matrixSet) {
        matrixArr[matrixColumn][matrixLine] = matrixSet;
    }
    void output() {
        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    Matrix plusMatrix(Matrix mx) {
        Matrix matrixPlus = new Matrix(matrixColumn, matrixLine);

        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr[i].length; j++) {
                matrixPlus.set(i, j, get(i, j) + mx.get(i, j));
            }
        }
        return matrixPlus;
    }
    Matrix multiNumber(int num) {
        Matrix matrix = new Matrix(matrixColumn, matrixLine);
        for (int i = 0; i < matrix.matrixColumn; i++) {
            for (int j = 0; j < matrix.matrixLine; j++) {
                matrix.set(i, j, get(i, j) * num);
            }
        }
        return matrix;
    }
    Matrix multiMatrix(Matrix s) {
        Matrix matrix = new Matrix(matrixColumn, matrixLine);
        int calc = 0;

        for (int i = 0; i < matrix.matrixColumn; i++) {
            for (int j = 0; j < matrix.matrixLine; j++) {
                if (matrix.matrixColumn < matrix.matrixLine) {
                    for (int k = 0; k < matrix.matrixColumn; k++) {
                        calc = calc + (get(i, k) * get(k,j));
                    }
                }
                else {
                    for (int k = 0; k < matrix.matrixLine; k++) {
                        calc = calc + (get(i, k) * s.get(k,j));
                    }
                }
                matrix.set(i,j,calc);
                calc = 0;
            }
        }
        return matrix;
    }
}
