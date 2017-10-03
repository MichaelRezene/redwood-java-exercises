package util;

import util.Input;

        public class InputTest {
    public static void main(String[] args) {
               Input input = new Input();
            System.out.print("Enter a number between 1 and 10");
               int number = input.getInt();
                        System.out.println("You enetered: " + number);

        double anOtherNum = input.getDouble();
        System.out.println("Your decimal number is: " + anOtherNum);

        System.out.println("We almost finish.");

          }
 }