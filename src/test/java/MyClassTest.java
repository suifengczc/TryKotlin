import org.junit.Before;
import org.junit.Test;


public class MyClassTest {

    @Before
    public void setUp() throws Exception {
        MyClass my = new MyClass();
        my.sayHello();
    }

    @Test
    public void sayHello() {
    }
}