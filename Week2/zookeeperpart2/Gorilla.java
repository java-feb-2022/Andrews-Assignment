package Week2.zookeeperpart2;

public class Gorilla extends Mammals {
    
    public void eatBanana() {
        energy += 10;
        System.out.println("Gorilla eats a Banana and gains 10 energy");
    }

    public void throwObject() {
        energy -= 5;
        System.out.println("Gorilla throws an object, using 5 energy in the process");
    }

    public void climb() {
        energy -= 10;
        System.out.println("Gorilla climbs up a tree, losing 10 energy with the effort");
    }
}
