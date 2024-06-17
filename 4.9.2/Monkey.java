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