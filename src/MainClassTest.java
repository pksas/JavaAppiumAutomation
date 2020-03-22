import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        int actual = new MainClass().getLocalNumber();
        int expected = 14;

        assertEquals("The result of the getLocalNumber method is not equal to 14", expected, actual);
    }

    @Test
    public void testGetClassNumber()
    {
        int actual = new MainClass().getClassNumber();

        Assert.assertTrue("The result of the getClassNumber method is not bigger than 45", actual > 45);
    }

    @Test
    public void testGetClassString()
    {
        String checkedLine = new MainClass().getClassString();
        boolean isHelloPresence = checkedLine.contains("hello");
        if (!isHelloPresence) {
            isHelloPresence = checkedLine.contains("Hello");
        }
        Assert.assertTrue("The result of the method getClassString is not contains substring 'Hello' or 'hello'", isHelloPresence);
    }
}
