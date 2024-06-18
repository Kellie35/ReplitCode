package unit4_9_2;

import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
//1-29
    /*Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();*/
    /*Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.eat();
    tiger.isNocturnal();
    tiger.getLifeSpan();*/
        //elephant.trumpet();
    /*Tiger tiger = new Tiger();
    tiger.swim();
    tiger.huntA();
    tiger.roar();
    tiger.isNocturnal(); */
        //Gorilla gorilla = new Gorilla();
    /*Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    Hippo hippo = new Hippo();
    hippo.eat();*/

//30
    /*Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();*/

//4.9.5
        ArrayList <Animal> zoo = new ArrayList <Animal>();
        Animal a = new Animal();
        Deer d = new Deer();
        zoo.add(d);
        Elephant e = new Elephant();
        zoo.add(e);
        Giraffe g = new Giraffe();
        zoo.add(g);
        Gorilla go = new Gorilla();
        zoo.add(go);
        Hippo h = new Hippo();
        zoo.add(h);
        Lion l = new Lion();
        zoo.add(l);
        Monkey m = new Monkey();
        zoo.add(m);
        Owl o = new Owl();
        zoo.add(o);
        Penguin p = new Penguin();
        zoo.add(p);
        Tiger t = new Tiger();
        zoo.add(t);

        for(int n = 0; n < zoo.size(); n++)
        {
            //(zoo.get(n)).speak();
            a.hearAnimal(zoo.get(n));
        }

    }
}