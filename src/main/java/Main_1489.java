import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    Шоколад
    Петя очень любит шоколад. И Маша очень любит шоколад. Недавно Петя купил шоколадку и теперь хочет поделиться ею с Машей.
    Шоколадка представляет собой прямоугольник n x m, который полностью состоит из маленьких шоколадных долек — прямоугольников 2 x 1.
    Петя  делит  шоколадку  на  две  части,  разламывая  ее  вдоль  некоторой  прямой,  параллельной одному  из  краев
    шоколадки.  Ни  Петя,  ни  Маша  не  любят  ломаные  дольки,  поэтому  Петя  хочет разломать шоколадку так,
    чтобы ни одна долька не была повреждена. Помогите Пете поделиться шоколадкой с Машей.

    Технические условия
    Входные данные
        В первой строке входного файла два целых числа n и m  (1 ≤ n, m ≤ 20; хотя бы одно из чисел n  и  m —  четно).
        Далее  следуют  n  строк  по  m  чисел  в  каждой  —  номера  долек,  в  которые  входят соответствующие кусочки шоколадки.
        Дольки имеют номера от  1 до (n·m)/2, и никакие две дольки не имеют одинаковые номера.
    Выходные данные
        В выходной файл выведите "Yes", если Петя может разломать шоколадку, не повредив дольки. Иначе выведите "No".
 */

public class Main_1489 {

    public static void main(String[] args) {
        new Task_1489_Resolver(System.in, System.out).solve();
    }

    public static class Task_1489_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_1489_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            int rowCount = scanner.nextInt();
            int columnCount = scanner.nextInt();
            int[][] chocolate = new int[rowCount][columnCount];
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    chocolate[i][j] = scanner.nextInt();
                }
            }
            check(chocolate, rowCount, columnCount);
            writer.flush();
            writer.close();
        }

        private void check(int[][] chocolate, int rowCount, int columnCount) {
            if (mayBreakByRow(chocolate, rowCount, columnCount) || mayBreakByColumn(chocolate, rowCount, columnCount)) {
                writer.println("Yes");
            } else {
                writer.println("No");
            }
        }
        //можно ли поломать шоколадку вдоль строк
        private boolean mayBreakByRow(int[][] chocolate, int rowCount, int columnCount) {
            for (int i = 0; i < rowCount - 1; i++) {
                boolean okRow = true;
                for (int j = 0; j < columnCount; j++) {
                    if (chocolate[i][j] == chocolate[i + 1][j]) {
                        okRow = false;
                        break;
                    }
                }
                if (okRow) {
                    return true;
                }
            }
            return false;
        }
        //можно ли поломать шоколадку вдоль столбцов
        private boolean mayBreakByColumn(int[][] chocolate, int rowCount, int columnCount) {
            for (int i = 0; i < columnCount - 1; i++) {
                boolean okColumn = true;
                for (int j = 0; j < rowCount; j++) {
                    if (chocolate[j][i] == chocolate[j][i + 1]) {
                        okColumn = false;
                        break;
                    }
                }
                if (okColumn) {
                    return true;
                }
            }
            return false;
        }
    }
}
