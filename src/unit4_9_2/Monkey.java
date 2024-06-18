package unit4_9_2;

public class Monkey extends Primate
{
    public void climb()
    {
        System.out.println("The monkey climbs.");
    }

    public void howl()
    {
        System.out.println("The monkey howls.");
    }

    public void speak()
    {
        howl();
    }
}