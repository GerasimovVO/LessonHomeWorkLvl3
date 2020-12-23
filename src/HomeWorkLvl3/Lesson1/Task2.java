package HomeWorkLvl3.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать метод, который преобразует массив в ArrayList;
 */
public class Task2 {
    public <T> ArrayList<T> convertArrayToArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Task2 inst = new Task2();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] strArray = {"1", "2", "3", "4", "5"};
        System.out.println(inst.convertArrayToArrayList(intArray));
        System.out.println(inst.convertArrayToArrayList(doubArray));
        System.out.println(inst.convertArrayToArrayList(strArray));

    }

}
