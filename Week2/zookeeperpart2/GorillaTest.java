package Week2.zookeeperpart2;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla g1 = new Gorilla();
        System.out.println("--------Zoo Keeper Part 1---------");
        g1.displayEnergy();
        g1.throwObject();
        g1.throwObject();
        g1.throwObject();
        g1.displayEnergy();
        g1.eatBanana();
        g1.eatBanana();
        g1.displayEnergy();
        g1.climb();
        g1.displayEnergy();

        System.out.println("---------Zoo Keeper Part 2---------");
        Bat dracula = new Bat();
        dracula.displayEnergy();
        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();
        dracula.displayEnergy();
        dracula.eatHumans();
        dracula.eatHumans();
        dracula.displayEnergy();
        dracula.fly();
        dracula.displayEnergy();
    }
}
