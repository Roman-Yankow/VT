package by.bsuir.Yankow.task8.runner;

import by.bsuir.Yankow.Input;
import by.bsuir.Yankow.Print;
import by.bsuir.Yankow.task8.util.Sequences;

public class task8 {
    public static void main(String[] args) {
        double[] firstSequence = Input.arrayDouble();
        double[] secSequence = Input.arrayDouble();


        Print.array(Sequences.getPlacesToInsert(firstSequence, secSequence));
    }
}
