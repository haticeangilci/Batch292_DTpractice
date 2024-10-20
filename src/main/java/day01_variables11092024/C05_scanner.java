package day01_variables11092024;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        //----------------------------------------------------
        //1.yol
        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        Scanner input = new Scanner(System.in);
        /*System.out.println("Lütfen uzun kenarı giriniz: ");
        double uzunkenar = input.nextDouble();
        System.out.println("Lütfen kısa kenarı giriniz: ");
        double kısakenar = input.nextDouble();
        System.out.println("Lütfen yüksekliğine giriniz: ");
        double yukseklik = input.nextDouble();

        System.out.println("Prizmanın hacmi = " + uzunkenar * kısakenar * yukseklik);*/
        //2.yol
        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasinin sırasıyla uzun , kısa kenarini ve yükseliğini giriniz ☻");
        double uzunKenar= input.nextDouble();
        double kisaKenar= input.nextDouble();
        double yukseklik= input.nextDouble();

        System.out.println("prizmanın hacmi : "+uzunKenar*kisaKenar*yukseklik);
    }
}




