package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;
//        a program that takes an integer as input

public class Fizzbuzz {
    public static void main(String[] args) {
//        I create a variable to scan the keyboard with the name of input
        Scanner input = new Scanner(System.in);
        //   I print the action to be done
        try {
            System.out.print("Entre a number : ");
            //  Now reset the variable to get all the entries back
            int variable = input.nextInt();
//        I want to create a check to test if this input is divided by 3
        boolean variableDividedBy3 = variable%3==0;
        boolean variableDividedBy5 = variable%5==0;

        if (variableDividedBy3 && variableDividedBy5)
            System.out.println("FizzBuzz");
        else if (variableDividedBy5)
            System.out.println("Buzz");
        else if (variableDividedBy3 )
            System.out.println("Fizz");
        else
            System.out.println("The Number " + variable + " is Not divisible By 3 or 5.");
        } catch (InputMismatchException e) {
            System.out.println("Enter Invalid, please entry an integer \nErreur ==> " + e);
            input.next(); // Clean incorrect entry

        } finally {
            input.close(); // Close the Scanner
        }

    }
}
