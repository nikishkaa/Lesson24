package by.itstep.goutor.javalesson.lesson24.task.task1.controller;

import by.itstep.goutor.javalesson.lesson24.task.task1.model.logic.MatrixWorker;
import by.itstep.goutor.javalesson.lesson24.task.task1.util.Converter;
import by.itstep.goutor.javalesson.lesson24.util.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8}
        };

        ConsolePrinter.print(Converter.toString(matrix));

        ConsolePrinter.print("\nSum of matrix bounded elements is: " + MatrixWorker.sumBoundElements(matrix));

    }
}
