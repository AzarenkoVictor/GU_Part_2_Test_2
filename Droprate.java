import java.util.Random;

public class Droprate {
    public static int rnd() {
        Random random = new Random();
        return random.nextInt(100);
    }
}