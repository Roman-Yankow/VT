package by.bsuir.Yankow.task2.runner;

import by.bsuir.Yankow.Input;
import by.bsuir.Yankow.task2.util.Graph;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = Input.numberDouble();
        System.out.print("Enter y: ");
        double y = Input.numberDouble();

        System.out.println("Answer: " + Graph.containsPoint(x, y));
    }
}
