public class Tiger extends Feline
{
    public void swim()
    {
        System.out.println("The tiger swims.");
    }

    public void huntA()
    {
        System.out.println("The tiger hunts alone.");
    }

    public Tiger(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new tiger has arrived.");
    }

    public Tiger()
    {
        System.out.println("A new tiger has arrived.");
    }

    public void speak()
    {
        super.growl();
    }
}