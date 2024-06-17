public class Penguin extends Bird
{
    public Penguin()
    {
        System.out.println("A new penguin has arrived.");
    }

    public void fish()
    {
        System.out.println("The penguin fishes.");
    }

    public void speak()
    {
        super.chirp();
    }
}