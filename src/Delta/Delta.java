package Delta;

import java.util.Scanner;

public class Delta {
     public static void main(String[] args) {
         System.out.println("ax² + bx +c = 0");

         Scanner input = new Scanner(System.in);

         System.out.print("a = ");
         double a = input.nextDouble();

         System.out.print("b = ");
         double b = input.nextDouble();

         System.out.print("c = ");
         double c = input.nextDouble();

//         String resultDelta =  delta(a,b,c);
         System.out.println( delta(a,b,c));
     }
     private static String delta(double a, double b, double c) {
         double delta = Math.pow(b,2) - (4*a*c);

         System.out.println("Δ =  b² - 4 * a * c = "  + delta);

         if (delta > 0) {

             double x1 = (-b + Math.sqrt(delta)) / (2 * a);
             double x2 = (-b - Math.sqrt(delta)) / (2 * a);
//             System.out.println("Deux solutions réelles :\nx1 = " + x1 + "\nx2 = " + x2);
             return "Deux solutions réelles :\nx1 = " + x1 + "\nx2 = " + x2;

         } else if (delta == 0) {
             double  x = -b  / (2 * a);
//             System.out.println("Une solution réelle : x = " + x);
             return "Une solution réelle : x = " + x;

         } else {
//             System.out.println("Pas de solution réelle.");
             return "Pas de solution réelle.";
         }
//         return delta;
     }
}
