package matrix;

public class Matrix {
    // class variable
    int lines;
    int columns;
    double[][] matrixA = new double[this.lines][this.columns];
    //constructor for matrix
    public Matrix(double[][] matrix, int columns, int lines) {
        this.matrixA = matrix;
        this.columns = columns;
        this.lines = lines;
    }
    //matrix + matrix
    public void print1() {
        System.out.println("conclusion matrix: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    //matrix + matrix
    public void summation(double[][] A, double[][] B) {
        System.out.println("matrix + matrix: ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }
    //matrix x number
    public void multiplication(double[][] A, double num) {
        System.out.println("matrix x number ("+(int)num+"): ");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((A[i][j] * num) + " ");
            }
            System.out.print("\n");
        }
    }
    // matrix x matrix
    public void multiplyMatrix(double[][]matrix1, double[][]matrix2)
    {
        System.out.println("matrix x matrix: ");
        double[][]result = new double[lines][columns];
        for(int i=0;i<lines;i++)
        {
            for(int j=0;j<columns;j++)
            {
                for(int a=0;a<lines;a++)
                {
                    result[i][j] += matrix1[i][a] * matrix2[a][j];
                }
            }
        }
        for(int i=0;i<lines;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}