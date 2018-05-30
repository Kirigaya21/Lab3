

/**
 * Created by 1610521 on 2/28/2018.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class LAB3 {

        public static void One() {
            Random rnd = new Random();
            int[] a = new int[10];
            int[] f = new int[a.length];
            int sz = 0;

            for (int i = 0; i < a.length; ++i) {
                a[i] = rnd.nextInt(100) - 50;
            }

            for (int i = 0; i < a.length; ++i) {
                if (a[i] % 2 != 0) {
                    f[sz] = a[i];
                    sz++;
                }
            }
            int[] k = new int[sz];
            System.arraycopy(f, 0, k, 0, sz);

            System.out.println(Arrays.toString(k));
        }

        public static void Two() {
            int[][] one = {
                    {5, 3, 44},
                    {6, 1, 1},
                    {4, 12, 1},
                    {7, 2, 21}
            };
            int[][] two = {
                    {-1, 3, 4, 6},
                    {2, 1, 1, 7},
                    {4, 7, 10, 3},
                    {7, 2, 1, 3}
            };

            int rows = one.length <= two.length ? one.length : two.length;
            int cols = one[0].length <= two[0].length ? one[0].length : two[0].length;
            int res[][] = new int[rows][cols];
            int resm[][] = new int[rows][cols];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; ++j) {
                    res[i][j] = one[i][j] + two[i][j];
                }
            }
            for (int i = 0; i < resm.length; i++) {
                System.out.println(Arrays.toString(res[i]));
            }
            System.out.println();
            for (int i = 0; i < resm.length; i++) {
                for (int j = 0; j < res[i].length; ++j) {
                    res[i][j] = one[i][j] - two[i][j];
                }
            }
            for (int i = 0; i < resm.length; i++) {
                System.out.println(Arrays.toString(res[i]));
            }



        }

        public static void main(String[] args)  {
            One();
            Two();
        }
    }

