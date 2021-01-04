import java.util.Random;

public class RandomRange {
    public static void main(String[] args) {
        Random num = new Random();
        int randomnum = num.nextInt(10)+4;
        System.out.println("Random Number: " + randomnum);
    }
}   