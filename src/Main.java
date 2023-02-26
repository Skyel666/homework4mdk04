public class Main {
    public static void main(String[] args) {
        int lines = 2;
        int columns = 2;

        double[][] matrix1 = {
                {6, 3},
                {2, 6}};
        double[][] matrix2 = {
                {1, 3},
                {4, 8}};
        //conclusion first matrix
        Matrix matrixClass = new Matrix(matrix1, lines, columns);
        matrixClass.print1();

        //conclusion second matrix
        Matrix matrixClass2 = new Matrix(matrix2, lines, columns);
        matrixClass2.print1();

        //matrix + matrix
        matrixClass.summation(matrix1, matrix2);

        //matrix x number
        matrixClass.multiplication(matrix1, 3);

        //matrix x matrix
        matrixClass.multiplyMatrix(matrix1, matrix2);

    }
}
