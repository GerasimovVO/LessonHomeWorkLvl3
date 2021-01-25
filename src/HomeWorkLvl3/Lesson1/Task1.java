package HomeWorkLvl3.Lesson1;

import java.util.Arrays;

/**
 * Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
 * idx1 и idx2 номера элемента в массиве которые необходимо поменять
 * T[] array массив в котором меняються два элемента.
 */
public class Task1 {
    public  <T> void swapElement(int idx1, int idx2, T[] array){

        T buffer = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = buffer;

    }

    public static void main(String[] args) {
        //проверка
        Task1 inst = new Task1();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] strArray = {"1", "2", "3", "4", "5"};
        inst.swapElement(3,4, intArray);
        inst.swapElement(4,1,doubArray);
        inst.swapElement(2,3,strArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubArray));
        System.out.println(Arrays.toString(strArray));

    }
}
