public class Elephant extends Animal
{
    public void trumpet()
    {
        System.out.println("The elephant trumpets.");
    }

    public void speak()
    {
        trumpet();
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new elephant has arrived.");
    }

    public Elephant()
    {
        System.out.println("A new elephant has arrived.");
    }
}