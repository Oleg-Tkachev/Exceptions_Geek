import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(Enterfloat(scanner));
            scanner.close();
        }

    private static float Enterfloat(Scanner scanner) {
        System.out.print("Введите дробное число: ");
        while (true) {
            try {
                String result = scanner.nextLine();
                if (tryAgain(result)) {
                    throw new RuntimeException("Некорректный ввод");
                } else {
                    return Float.parseFloat(result);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.print("Введите дробное число повторно: ");
            }
        }
    }
    public static boolean tryAgain(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
