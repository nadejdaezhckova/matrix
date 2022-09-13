public class Main {
    public static void main(String[] args) {
        Matrix matrix1  = new Matrix (3,3);
        Matrix matrix2 = new Matrix (3,3);
        Matrix matrix3,matrix4,matrix5,matrix6;
        matrix1.output();
        matrix2.output();
        System.out.println("Сложение матриц");
        matrix3 = matrix1.plusMatrix(matrix2);
        matrix3.output();
        System.out.println("Умножение матрицы №1 на число 3");
        matrix4 = matrix1.multiNumber(4);
        matrix4.output();
        System.out.println("Умножение матрицы №3 на число 3");
        matrix5 = matrix2.multiNumber(4);
        matrix5.output();
        System.out.println("Умножение матриц");
        matrix6 = matrix1.multiMatrix(matrix2);
        matrix6.output();
    }
}
