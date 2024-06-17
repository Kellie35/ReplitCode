public class Giraffe extends Hooved
{
    public void hum()
    {
        System.out.println("The giraffe hums.");
    }

    public void speak()
    {
        hum();
    }

    public Giraffe (String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new giraffe has arrived.");
    }

    public Giraffe()
    {
        System.out.println("A new giraffe has arrived.");
    }
}