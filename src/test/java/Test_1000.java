import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test_1000 {

    @Test
    public void test1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Main_1000.Task_1000_Resolver resolver =
                new Main_1000.Task_1000_Resolver(new ByteArrayInputStream("1 1\n1 2\n".getBytes()), byteArrayOutputStream);
        resolver.solve();
        Assert.assertEquals("2\n3\n", new String(byteArrayOutputStream.toByteArray()));
    }
}
