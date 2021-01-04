import java.util.Random;

public class CoinFlip {
    
    public static void main(String[] args) {
        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();

        if (chance < 0.5) {
            System.out.println("heads!");
        }
        else {
            System.out.println("tails!");
        }
    } 
}
