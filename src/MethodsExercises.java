import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        add(4, 6);
        sub(3, 8);
        mult(4);
        div(20, 2);
        Scanner sc = new Scanner(System.in);
        String userContinue;
        do{
            int number = getInteger(1, 10);
            long factorNumber = calculateFactorial(number);
            System.out.println("The factorial number of " + number + "! = " + factorNumber);
            System.out.println();
            System.out.println("Do you want to continue? Y/N");
            userContinue = sc.nextLine();
        } while (userContinue.equalsIgnoreCase("yes") ||
                (userContinue.equalsIgnoreCase("y")));
        System.out.println("Thanks, bye.");
    }
    public static int add(int x, int y) {
        System.out.println(x + y);
        return x + y;
    }
    public static int sub(int x, int y) {
        System.out.println(x - y);
        return x - y;
    }
    public static int mult(int xy) {
        System.out.println(xy);
        return xy;
    }
    public static int div(int x, int y) {
        System.out.println(x / y);
        return x / y;
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 10 here: ");
        int number = sc.nextInt();
        if (number < min || number > max) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.print("The number you entered is " + number + "\n");
            System.out.println();
            return number;
        }
    }
    public static long calculateFactorial(int number){
        long factorNumber = 1;
        for (int i = 1; i <= number; i++){
            factorNumber *= i; //factorNumber = factorNumber * 1;
        }
        return factorNumber;
    }
}

