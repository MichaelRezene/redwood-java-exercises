import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ask anything");
            String msg = sc.nextLine();
            if (msg.endsWith("?")) {
                System.out.println("sure");
            } else if (msg.endsWith("!") || msg.equals(msg.toUpperCase()) && msg.isEmpty()) {
                System.out.println("Whoa, chill out!");
            } else if (msg.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("whatever");
            }
            System.out.println("Do you want continue? y,n");
            String option = sc.nextLine();
            if (!option.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}