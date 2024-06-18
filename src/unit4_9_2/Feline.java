package unit4_9_2;


public class Feline extends Animal
{
    public void roar()
    {
        System.out.println("The feline roars.");
    }

    public void growl()
    {
        System.out.println("The feline growls.");
    }

    public Feline (String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }

    public Feline()
    {

    }
}