import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        int actual = new MainClass().getLocalNumber();
        int expected = 14;

        assertEquals("The result of the testGetLocalNumber method is not equal to 14", expected, actual);
    }
}
