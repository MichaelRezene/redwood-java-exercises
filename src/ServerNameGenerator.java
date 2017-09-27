
import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = new String[]{"beautiful ", "sleeveless",
            "meaningless", "nicer", "adorable ", "gorgeous", "breakable", "homeless"};
    private static String[] nouns = {"Apple", "Mango", "Peach", "Banana", "Orange",
            "Grapes", "Watermelon", "Tomato"};

    public static String getRandom(String[] server) {
        Random random = new Random();
        int rand = random.nextInt(server.length);
        return server[rand];
    }
    public static void main(String[] args) {
        System.out.println("Here is your server name: \n "
                + getRandom(adjectives) + " - " + getRandom(nouns));
    }
}

