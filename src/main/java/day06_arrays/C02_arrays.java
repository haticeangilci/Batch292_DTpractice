package day06_arrays;
import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        bir multi-dimensional array olusturun
        ve olusturdugunuz arrayin elemanlarini yazdırınız
         */
                int[] a = {1, 2, 3};
                int[] b = {4, 5, 6};
                int[] c = {7, 8, 9};

                int[][] d = {a, b, c};


                int [][] e ={{1,2,3},{4,5,6},{7,8,9}};

                System.out.println(Arrays.deepToString(e));

            }
        }

