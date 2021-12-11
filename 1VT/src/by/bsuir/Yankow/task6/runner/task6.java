package by.bsuir.Yankow.task6.runner;

import by.bsuir.Yankow.Input;
import by.bsuir.Yankow.Print;
import by.bsuir.Yankow.task6.util.Matrix;

public class task6 {
    public static void main(String[] args) {
        double numbers[] = Input.arrayDouble();

        Print.matrix(Matrix.getMatrix(numbers));
    }
}
