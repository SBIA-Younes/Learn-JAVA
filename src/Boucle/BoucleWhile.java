package Boucle;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
//      I'm going to initialize my counter for while loop
        int i = 5;
//      I create a loop while
        while (i>0) {
//          I print "Hello World !!" with my counter i
            System.out.println("Hello World !! " + i);
//          I decrement my counter so as not to have an infinity loop
            i--;
        }
        System.out.println("-----");
        i = 0;
        while (i<5) {
            System.out.println("Hello World !! " + i);
            i++;
        }
        scanLoop();
    }

//        I'm going to create a loop white while that scans the keyboard
    private static void scanLoop() {
//        I initialize scanner variable for scan
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("OK")){
            System.out.print("Enter a word : ");
            input = scanner.nextLine();
            // Inp
            System.out.println( "You have input " + input + ", It is incorect\n input again Thank's");


        }

    }
}
