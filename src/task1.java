public class task1 {

//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {
        int a = 15;  // делимое
        int b = 3;   // делитель
        System.out.printf("Результат деления равен %d.\n", divide(a, b));


        int[] array = {1, 3, 7, 6, 2, 9, 0, 4, 10, 11, 15, 17};
        int index = 7;

        String[] strArray = {"geek", "brains", "is",  null, "help", "me!"};


        checkIndex(array, index);
        checkArray(strArray);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Нельзя делить на ноль!");
        }
        return a / b;
    }

    public static void checkIndex(int[] array, int index) {
        if (index > array.length - 1)
            throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом нет в массиве.");
        else System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
    }

    public static void checkArray(String[] strArray){
        for (String item: strArray){
            if(item == null) throw new NullPointerException("Элемент отсутствует");
            System.out.println(item);
        }
    }
}



