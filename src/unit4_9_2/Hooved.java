package unit4_9_2;

public class Hooved extends Animal
{
    public void forage()
    {
        System.out.println("The hooved animal forages for food.");
    }

    public Hooved (String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }

    public Hooved()
    {
        System.out.println("The hooved animal arrived.");
    }
}