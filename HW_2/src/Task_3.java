import java.util.Scanner;

//  Программа, которая выбросит Exception, когда пользователь вводит пустую строку.
//  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текстовое сообщение: ");
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        } else if (text.isBlank()) {
            throw new RuntimeException("Строка содержит только пробелы!");
        } else {
            System.out.println(text);
        }
        scanner.close();
    }
}
