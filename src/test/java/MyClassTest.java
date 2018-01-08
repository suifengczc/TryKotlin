import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MyClassTest {
    private MyClass my;
    @Before
    public void setUp() throws Exception {
        my = new MyClass();
    }

    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello",my.sayHello());
    }
}