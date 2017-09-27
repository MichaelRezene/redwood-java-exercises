import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while loop
//        int i = 5;
//
//        while(i <= 15){
//            System.out.print( " " + i  );
//            i++;
//        }

        // ========do while loop============
        // Create a do-while loop that will count by 2's starting
        // with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do{
//            System.out.println(i);
//           i += 2;
//        }while(i <= 100) ;

        //===========
        //Alter your loop to count backwards
        // by 5's from 100 to -10.
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);


        //displays the number squared on each line while
        // the number is less than 1,000,000. Output should equal:
//        long number1 = 2;
//        do{
//            System.out.println(number1);
//            number1 *= number1;
//        }while(number1 < 1000000) ;

        //======= for loop============
//        System.out.println();
//         for (int j = 5; j <= 15; j++){
//             System.out.print(" " + j);
//         }
//        System.out.println();
//        for (int b = 2; b <= 100; b++){
//            if(b % 2 == 0){
//                System.out.println(b);
//            }
//       }
//        System.out.println();
//        for (int jj = 100; jj >= -10; jj--){
//            if(jj % 5 == 0) {
//                System.out.println(jj);
//            }
//           }

        //===============

//        for(int num = 1; num <= 100; num++) {
//            if ((num % 3 == 0) && (num % 5 == 0)) {
//                System.out.print(" FizzBuzz");
//            } else if (num % 3 == 0) {
//                System.out.print(" Fizz ");
//            } else if (num % 5 == 0) {
//                System.out.print(" Buzz ");
//            }else{
//                System.out.print(num);
//            }
//        }


        // =====Table power==========
        System.out.println("Enter integer here: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("You entered ");
        System.out.println("number | squared | cubed\n" +
                "------ |-------- |-----");
        for (int i = 1; i <= number; i++){
            System.out.printf("%-7s| ", i);
            System.out.printf("%-8s| ", (i * i));
            System.out.printf("%-5s ", (i * i * i));
            System.out.println();

        System.out.println("Do you want continue? y/n");
        String option = sc.nextLine();
        if (!option.equalsIgnoreCase("y")) {
            System.out.println("Ok, good bye");
            break;
           }
        }

//
//        //========== Students grade ==========
//        while (true) {
//            System.out.println("Enter yor grade here:");
//            int grade = sc.nextInt();
//            sc.nextLine();
//            if (grade >= 99 && grade <= 100) {
//                System.out.println(" Bingo your grade is A+ ");
//            } else if (grade <= 100 && grade >= 88) {
//                System.out.println(" Your grade is A. ");
//            } else if (grade <= 87 && grade >= 80) {
//                System.out.println(" Your grade is B. ");
//            } else if (grade <= 79 && grade >= 67) {
//                System.out.println(" Your grade is C. ");
//            } else if (grade <= 66 && grade >= 60) {
//                System.out.println(" Your grade is D. ");
//            } else if (grade <= 59) {
//                System.out.println("Your grade is F.\n Please see me after class!");
//            }
//
//            System.out.println("Do you want continue? y/n");
//            String option = sc.nextLine();
//
//            if (!option.equalsIgnoreCase("y")) {
//                System.out.println("Ok, good bye");
//
//                break;
//            }
//        }

    }
}