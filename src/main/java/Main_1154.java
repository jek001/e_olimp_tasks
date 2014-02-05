import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Кружок хорового пения
    В некотором учебном заведении функционирует кружок хорового пения. Начало кружка всегда происходит единообразно:
    по сигналу руководителя кружка все N участников становятся в круг и каждый M-й для распевки поёт гамму.
    Руководитель кружка заметил, что размять голосовые связки не всегда удаётся всем участникам кружка.
    По заданным N и M помогите ему определить, или в очередной раз в разминке примут участие все участники хора.

    Технические условия
    Входные данные
        Входные данные состоят из нескольких тестовых случаев. Каждый тестовый случай расположен в
        отдельной строке и содержит два целых числа N и M. (1 ≤ N, M ≤ 103).
    Выходные данные
        Для каждого тестового случая в отдельной строке выведите "YES", если в разминке примут участие
        все участники хора, в противном случае выведите "NO".
 */

public class Main_1154 {

    public static void main(String[] args) {
        new Task_1154_Resolver(System.in, System.out).solve();
    }

    public static class Task_1154_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_1154_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            while (scanner.hasNextInt()) {
                int count = scanner.nextInt();
                int number = scanner.nextInt();
                //логика такая: если наибольший общий делитель > 1, тогда NO, иначе - YES
                writer.println((gcd(count, number) == 1) ? "YES" : "NO");
            }

            writer.flush();
            writer.close();
        }
        //вычисление наибольшего общего делителя
        public int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }
}
