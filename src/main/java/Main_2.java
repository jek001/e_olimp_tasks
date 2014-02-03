import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {

        new Task_2_Resolver(System.in, System.out).solve();

    }

    public static class Task_2_Resolver {

        private Scanner scanner;
        private PrintWriter writer;

        public Task_2_Resolver(InputStream is, OutputStream os) {
            this.scanner = new Scanner(is);
            this.writer = new PrintWriter(os);
        }

        public void solve() {
            String number = scanner.next();
            writer.println(number.length());
            writer.flush();
            writer.close();

        }
    }
}
