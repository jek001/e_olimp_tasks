import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Обмен
    В рождественский вечер на окошке стояло три цветочка, слева на право: герань, крокус и фиалка.
    Каждое утро Маша вытирала окошко и меняла местами стоящий справа цветок с центральным цветком.
    А Таня каждый вечер поливала цветочки и меняла местами левый и центральный цветок. Требуется определить
    порядок цветов ночью по прошествии k дней.

    Технические условия
    Входные данные
        Первая строка содержит количество тестов  m (1 ≤ m ≤ 12). В каждой из следующих m строк находится
        количество дней k (1 ≤ k ≤ 1000).
    Выходные данные
        Вывести m строк, содержащих по три латинских буквы: "G", "C" и "V" (заглавные буквы без пробелов),
        описывающие порядок цветов на окошке по истечении k дней (слева направо). Обозначения: G – герань, C – крокус, V – фиалка.
 */
public class Main_407 {

    public static void main(String[] args) {
        new Task_407_Resolver(System.in, System.out).solve();
    }

    public static class Task_407_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_407_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                int days = scanner.nextInt();
                solve(days);
            }
            writer.flush();
            writer.close();
        }

        private void solve(int days) {
            char[] flowers = {'G','C','V'};
            for (int i = 0; i < days; i++) {
                char tmp = flowers[1];
                flowers[1] = flowers[2];
                flowers[2] = tmp;

                tmp = flowers[1];
                flowers[1] = flowers[0];
                flowers[0] = tmp;
            }
            writer.println(flowers[0] + "" + flowers[1] + "" + flowers[2]);
        }
    }
}
