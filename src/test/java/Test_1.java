import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test_1 {

    @Test
    public void test1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_1.Task_1_Resolver resolver =
                new Main_1.Task_1_Resolver(new ByteArrayInputStream("34".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("3 4\n", new String(outputStream.toByteArray()));
    }

    @Test
    public void test2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_1.Task_1_Resolver resolver =
                new Main_1.Task_1_Resolver(new ByteArrayInputStream("10".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("1 0\n", new String(outputStream.toByteArray()));
    }

    @Test
    public void test3() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_1.Task_1_Resolver resolver =
                new Main_1.Task_1_Resolver(new ByteArrayInputStream("99".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("9 9\n", new String(outputStream.toByteArray()));
    }
}
