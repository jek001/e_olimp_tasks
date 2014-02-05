import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Test_1154 {

    @Test
    public void test1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Main_1154.Task_1154_Resolver resolver =
                new Main_1154.Task_1154_Resolver(new ByteArrayInputStream("4 1\n6 3\n".getBytes()), byteArrayOutputStream);
        resolver.solve();
        Assert.assertEquals("YES\nNO\n", new String(byteArrayOutputStream.toByteArray()));
    }
}
