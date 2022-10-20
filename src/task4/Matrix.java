package task4;

import java.util.Scanner;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.data = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("matrix[%s][%s] >> ", i + 1, j + 1);
                data[i][j] = sc.nextDouble();
            }
        }
    }

    public double at(int row, int col) {
        return data[row][col];
    }

    public void plus(Matrix oth) {
        if (this.rows != oth.rows || this.cols != oth.cols) {
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] += oth.data[i][j];
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("matrix[%s][%s] = %s%n", i + 1, j + 1, data[i][j]);
            }
        }
    }
}

class MatrixTester {
    public static void main(String[] args) {
        var matrix = new Matrix(2, 2);
        var matrix2 = new Matrix(2, 2);
        matrix.print();
        matrix.plus(matrix2);
        matrix.print();
    }
}
