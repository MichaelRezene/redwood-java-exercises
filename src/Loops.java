
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        float number = 4.3f;
        int integerNumber = 4;
        // java will choose the more precise type

        System.out.println(number > integerNumber); // true
        System.out.println(number == integerNumber); //false

        Scanner input = new Scanner(System.in);
        int aNumber = input.nextInt();

        if(aNumber % 2 == 0){
            System.out.println(aNumber + " is even.");

        }else{
            System.out.println(aNumber + " is add.");

        }
        input.nextLine();
        System.out.println("Enter the name of your cohort");
        String cohort = input.nextLine();
        System.out.println("Redwood" == cohort);// are this 2 objects the same


        int age = 20;
        switch (age){
            case 20:
                System.out.println("You are 20 years old");
                break;
                default:
                    System.out.println("You are " + age + "years old");
        }

            // modules using subtraction
        int divedend = 4;
        int divisor = 5;
        int reminder = divedend;

        while (reminder < divisor){
            reminder -= divisor;//2
        }
        System.out.println("The reminder of " + divedend + " divided by " + divisor + "is" + reminder);


        // do while loop
        int posetiveNumber;
        do{
            System.out.println("Enter a posetive number:");
            posetiveNumber = input.nextInt();
        }while(posetiveNumber <= 0);

        // for loop
        int base = 2;
        int exponent = 5;
        int result = 1;
        for (int i = 0; i < exponent; i++ ){
            result *= base;
        }
        System.out.println("2^5 = " + result);

        // continue

        for (int counter = 0; counter <= 0; counter++){
            if (counter == 5){ // or you can break it to use break; if counter ==5;

                System.out.println("Five");
                continue;
            }else if (counter == 8){
                System.out.println("Oto");

            }
        }

    }
}
