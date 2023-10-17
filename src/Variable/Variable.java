package Variable;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Point;
import java.util.Arrays;
import java.util.Date;


public class Variable {

        public static void main(String[] var0) {
//           variable();
           operateurLogique();
        }

        private static void variable (){
            int var1 = 1234567895;
            boolean var2 = true;
            long var3 = 1234568643458545644L;
            String var5 = "Hello Word ! ";
            char var6 = 'B';
            boolean var7 = true;
            float var8 = 45.52F;
            double var9 = 45.52;
            System.out.println(var5 + var1 + " " + var7 + " " + var8 + " " + var9 + " " + var6);
            Date var11 = new Date();
            System.out.println(var11);
            Point var12 = new Point(1, 2);
            System.out.println(var12);
            int[] var13 = new int[]{8, 2, 0, 0, 0, 0};
            var13 = new int[]{8, 5, 5, 53, 1035};
            int[] var14 = new int[]{9, 2, 3, 5, 1};
            System.out.println(Arrays.toString(var13));
            System.out.println(Arrays.toString(var14));
            Arrays.sort(var14);
            Arrays.sort(var13);
            System.out.println(Arrays.toString(var13));
            System.out.println(Arrays.toString(var14));
            System.out.println(var14);
            System.out.println(var14.length);
        }

        private static void operateurLogique(){
            int myNumber = 5;
            boolean result_et = myNumber > 0 && myNumber % 2 ==0;
            boolean result_ou = myNumber > 0 || myNumber % 2 ==0;
            System.out.println(result_ou);
        }

}
