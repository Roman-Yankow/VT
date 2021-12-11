package by.bsuir.Yankow.task4.runner;

import by.bsuir.Yankow.Input;
import by.bsuir.Yankow.Print;
import by.bsuir.Yankow.task4.util.PrimeNumbers;

public class task4 {
    public static void main(String[] args){

        int numbers[] = Input.arrayInt();

        System.out.println("Indexes:");

        Print.array(PrimeNumbers.getPrimeNumbersIndexes(numbers));
    }
}
