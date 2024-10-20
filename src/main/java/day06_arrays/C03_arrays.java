package arrays02;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
         /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        String[][] str = {{"Ali", "Can"}, {"Ömer", "Faruk"}, {"Hasan", "Hüseyin"}, {"Veli", "Can", "Han"}};
        elemanYazdir(str);

    }

    public static void elemanYazdir(String[][] str) {
        for (String [] s:str) {
            for (String a:s
            ) {
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}