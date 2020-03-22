public class MainClass
{
    private int class_number = 20;
    private String getClassString = "Hello, world";

    public int getLocalNumber()
    {
        return 14;
    }

    public int getClassNumber()
    {
        return this.class_number;
    }

    public String getClassString()
    {
        return this.getClassString;
    }
}
