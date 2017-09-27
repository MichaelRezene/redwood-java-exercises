import java.util.Scanner;

public class ConsoleLecture {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer here: ");
        int number = sc.nextInt();
        //You will get an InputMismatchException error if you try to put other than numbers
        System.out.println(number);

        sc.nextLine();

        System.out.println("Enter your first names here: ");
        String name1 = sc.nextLine();
        System.out.println("Enter your second names here: ");
        String name2 = sc.nextLine();
        System.out.println("Enter your third names here: ");
        String name3 = sc.nextLine();
        System.out.println("Your three favorite names are: " + name1 + ", "
                + name2 + " and " + name3 + ".");

        System.out.println();

        System.out.println("Enter your sentence here: ");
        String sentence = sc.nextLine();
        System.out.println("Your sentence is: " + sentence);

        System.out.println();
        System.out.println("Enter length here:");
        double length = sc.nextDouble();
        System.out.println("Enter width here: ");
        double width = sc.nextDouble();
        System.out.println();
        System.out.println(length + " is length and " + width + " is width.");
        sc.nextLine();

       System.out.println("Enter the length of the classroom:");
       double length1 = sc.nextDouble();


        double area = length1 * width;
        double perimter = 2 * length1 + 2 * width;
        System.out.println(" The area of the classroom is: " + area + " .");
        System.out.println(" & ");
        System.out.println(" The perimeter of the classroom is: " + perimter + " .");


    }
}
