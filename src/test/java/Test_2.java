import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test_2 {

    @Test
    public void test1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_2.Task_2_Resolver resolver =
                new Main_2.Task_2_Resolver(new ByteArrayInputStream("13243".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("5\n", new String(outputStream.toByteArray()));
    }

    @Test
    public void test2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_2.Task_2_Resolver resolver =
                new Main_2.Task_2_Resolver(new ByteArrayInputStream("132431234567890".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("15\n", new String(outputStream.toByteArray()));
    }

    @Test
    public void test3() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_2.Task_2_Resolver resolver =
                new Main_2.Task_2_Resolver(new ByteArrayInputStream("0".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("1\n", new String(outputStream.toByteArray()));
    }
}
