package Week2.zookeeperpart2;

public class Bat extends Mammals {
    public Bat(){
        this.energy = 300;
    }

    public void fly() {
        energy -= 50;
        System.out.println("A shadow lifts into the air and disappears into the night.");
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("A single choked cry is cut of in the dark.");
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("The sounds of screams and fire drift through the valley.");
    }
}
