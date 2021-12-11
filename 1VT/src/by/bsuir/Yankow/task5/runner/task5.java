package by.bsuir.Yankow.task5.runner;

import by.bsuir.Yankow.Input;
import by.bsuir.Yankow.task5.util.Sequence;

public class task5 {
    public static void main(String[] args){
        int numbers[] = Input.arrayInt();
        int answer = Sequence.getMinElementsForDel(numbers);

        System.out.format("Delete %d elements.", answer);
    }
}
