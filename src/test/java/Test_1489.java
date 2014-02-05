import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test_1489 {

    @Test
    public void test1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Main_1489.Task_1489_Resolver resolver =
                new Main_1489.Task_1489_Resolver(new ByteArrayInputStream("2 3\n1 1 2\n3 3 2".getBytes()), byteArrayOutputStream);
        resolver.solve();
        Assert.assertEquals("Yes\n", new String(byteArrayOutputStream.toByteArray()));
    }

    @Test
    public void test2() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Main_1489.Task_1489_Resolver resolver =
                new Main_1489.Task_1489_Resolver(
                        new ByteArrayInputStream("5 6\n1 2 2 3 3 4\n1 5 6 7 7 4\n8 5 6 9 10 10\n8 11 11 9 12 13\n14 14 15 15 12 13".getBytes()), byteArrayOutputStream);
        resolver.solve();
        Assert.assertEquals("No\n", new String(byteArrayOutputStream.toByteArray()));
    }
}
