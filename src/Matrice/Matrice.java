package Matrice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Matrice {

    public static void main(String[] args) {
        int[][] myMatrice = new int[3][3];
        myMatrice[0][2]= 2;
        int[][] myMatrice_2 = {{7, 8, 9}, {1, 2, 3},{4,5,6}};
        System.out.println(Arrays.deepToString(myMatrice));
        System.out.println(Arrays.deepToString(myMatrice_2));
        Arrays.sort(myMatrice_2, Comparator.comparingInt(arr -> arr[0]));
        System.out.println(Arrays.deepToString(myMatrice_2));
    }
}
