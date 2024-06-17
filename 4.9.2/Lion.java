public class Lion extends Feline
{
    public void huntP()
    {
        System.out.println("The lion hunts in a pack.");
    }

    public Lion (String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new lion has arrived.");
    }

    public Lion()
    {
        System.out.println("A new lion has arrived.");
    }

    public void speak()
    {
        super.roar();
    }
}