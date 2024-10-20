package day06_arrays;

public class C04_arrays {
    public static void main(String[] args) {
         /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int sayilar[][]={{1,3,5,7,9,11},{2,4,6,8,10},{12,13,14,15,16}};
        //System.out.println(sayilar[0][0] + sayilar[1][1] + sayilar[2][2]);//hardcoding
        int toplam=0;
        for (int outerIndex = 0; outerIndex < sayilar.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < sayilar[outerIndex].length; innerIndex++) {
                if (outerIndex==innerIndex){
                    toplam+=sayilar[outerIndex][innerIndex];
                }
            }
        }
        System.out.println("toplam = " + toplam);
    }
}