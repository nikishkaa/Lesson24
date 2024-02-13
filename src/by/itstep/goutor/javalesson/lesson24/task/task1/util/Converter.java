package by.itstep.goutor.javalesson.lesson24.task.task1.util;

public class Converter {
    public static String toString(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int[] array : matrix) {
            for (int element : array) {
                builder.append(element).append(" ");
            }
            builder.append("\n");
        }


        return builder.toString();
    }
}
