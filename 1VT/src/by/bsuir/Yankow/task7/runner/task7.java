package by.bsuir.Yankow.task7.runner;

import by.bsuir.Yankow.Input;
import by.bsuir.Yankow.Print;
import by.bsuir.Yankow.task7.util.ShellSort;

public class task7 {
    public static void main(String[] args) {
        double numbers[] = Input.arrayDouble();

        Print.array(ShellSort.sort(numbers));
    }
}
