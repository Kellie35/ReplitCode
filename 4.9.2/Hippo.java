public class Hippo extends Hooved
{
    public void groan()
    {
        System.out.println("The hippo groans.");
    }

    public void speak()
    {
        groan();
    }

    public Hippo(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new hippo has arrived.");
    }

    public Hippo()
    {
        System.out.println("A new hippo has arrived.");
    }
}