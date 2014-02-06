import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test_407 {

    @Test
    public void test1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Main_407.Task_407_Resolver resolver =
                new Main_407.Task_407_Resolver(new ByteArrayInputStream("2\n1\n5".getBytes()), outputStream);
        resolver.solve();
        Assert.assertEquals("VGC\nCVG\n", new String(outputStream.toByteArray()));
    }
}
