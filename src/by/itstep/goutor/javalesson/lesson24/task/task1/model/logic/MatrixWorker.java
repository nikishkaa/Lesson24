package by.itstep.goutor.javalesson.lesson24.task.task1.model.logic;

public class MatrixWorker {
    public static int sumBoundElements(int[][] matrix) {

        int sum = 0;

        for (int element : matrix[0]) {
            sum += element;
        }

        for (int element : matrix[matrix.length - 1]) {
            sum += element;
        }

        for (int i = 1; i < matrix.length - 1; i++) {
            sum += matrix[i][0];
        }

        for (int i = 1; i < matrix.length - 1; i++) {
            sum += matrix[i][matrix[0].length - 1];
        }
        return sum;
    }
}
