public class Bird extends Animal
{
    public Bird()
    {

    }

    public void chirp()
    {
        System.out.println("The bird chirps.");
    }

    public Bird (String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }

}