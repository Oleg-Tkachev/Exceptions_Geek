import java.lang.reflect.Array;
import java.util.Arrays;

public class task2 {
    //    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    //    и возвращающий новый массив,
    //    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    //    Если длины массивов не равны, необходимо как-то оповестить пользователя
    public static void main(String[] args) {
        int[] arr_1 = {7, 2, 3, 4, 5, 6};
        int[] arr_2 = {1, 1, 2, 3, 4, 4, 7};

        System.out.println("Массив №1");
        System.out.println(Arrays.toString(arr_1));
        System.out.println("Массив №2");
        System.out.println(Arrays.toString(arr_2));

        System.out.println("Разности элементов двух входящих массивов в той же ячейке");
        System.out.println(Arrays.toString(checkLengthArr(arr_1, arr_2)));
    }

    public static int[] checkLengthArr(int[] arr_1, int[] arr_2) {
        if (arr_1.length != arr_2.length) {
            throw new ArrayIndexOutOfBoundsException("Разная длина массивов");
        }
        int[] array = new int[arr_1.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr_1[i] - arr_2[i];
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number);

        }
    }
}

