import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Задача A + B
    Посчитайте A + B.

    Технические условия
    Входные данные
        В каждой строке задано два целых числа A и B (|A|, |B| ≤ 30000). Считывайте данные до конца файла.
    Выходные данные
        Для каждого приведенного примера выведите сумму A + B в отдельной строке.
 */
public class Main_1000 {

    public static void main(String[] args) {
        new Task_1000_Resolver(System.in, System.out).solve();
    }

    public static class Task_1000_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_1000_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            while (scanner.hasNextInt()) {
                int firstNumber = scanner.nextInt();
                int secondNumber = scanner.nextInt();
                writer.println(firstNumber + secondNumber);
            }
            writer.flush();
            writer.close();
        }
    }
}
