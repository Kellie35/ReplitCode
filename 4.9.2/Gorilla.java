public class Gorilla extends Primate
{
    public void grunt()
    {
        System.out.println("The gorilla grunts.");
    }

    public void speak()
    {
        grunt();
    }

    public Gorilla()
    {
        System.out.println("A new gorilla has arrived.");
    }
}
