import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main_4 {

    public static void main(String[] args) {
        new Task_4_Resolver(System.in, System.out).solve();
    }

    public static class Task_4_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_4_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            scanner.useLocale(Locale.US);

            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double r1 = scanner.nextDouble();

            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double r2 = scanner.nextDouble();

            printResult(x1, y1, r1, x2, y2, r2);
            writer.flush();
            writer.close();
        }

        private void printResult(double x1, double y1, double r1, double x2, double y2, double r2) {
            //расстояние между центрами окружностей
            double diff = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2) * (y1 - y2));
            //точки совпадают
            if (diff == 0d) {
                //но радиусы не совпадают
                if (r1 != r2) {
                    writer.println("0");
                    return;
                }
                //окружности идентичны
                writer.println("-1");
                return;
            }
            double radiusSum = r1 + r2;
            //окружности отдалены одна от другой
            if (diff > radiusSum) {
                writer.println("0");
                return;
            }
            //окружности соприкасаются
            if (diff == radiusSum) {
                writer.println("1");
                return;
            }
            double radiusDiff = Math.abs(r1 - r2);
            //окружности пересекаются
            if (radiusDiff < diff) {
                writer.println("2");
                return;
            }
            //окружности соприкасаются
            if (radiusDiff == diff) {
                writer.println("1");
                return;
            }
            //одна окружность в другой
            writer.println("0");
        }
    }
}
