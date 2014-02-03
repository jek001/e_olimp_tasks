import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main_1 {

    public static void main(String[] args) {

        new Task_1_Resolver(System.in, System.out).solve();

    }

    public static class Task_1_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_1_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            String number = scanner.next();
            writer.println(number.charAt(0) + " " + number.charAt(1));
            writer.flush();
            writer.close();

        }
    }
}
