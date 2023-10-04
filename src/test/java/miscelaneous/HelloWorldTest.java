package miscelaneous;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    void greetingsValidation(){
        String validate = new HelloWorld().greetings();
        assertTrue("Hello World", validate.equals("Hello world"));
    }
}
