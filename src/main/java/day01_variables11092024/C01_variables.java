package day01_variables11092024;

public class C01_variables {
    public static void main(String[] args) {
    /*
2 tanedirler primitive ve non-primitive olmak üzere icerisinde küçük degerler saklanır
pasif özelliklerdir
 */

//iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz
        int a = 76;
        double b = 89.6;
        double toplam = a + b;
        System.out.println("toplam = " + toplam);


//ayni sayilari toplayip sadece tam kismini alin

//1.yol
//int toplam2 = a + (int)b ;


//2.yol :
// int toplam2 = (int)(a + b) ;


//3. yol
//int toplam2=(int)toplam;

        double x = 5.7;
        double y = 6.8;


        double toplam3 = x + y;
        System.out.println("toplam3 = " + toplam3);//12.5

        int toplam4 = (int) x + (int) y;
        System.out.println("toplam4 = " + toplam4);//11

        int toplam5 = (int) (x + y);
        System.out.println("toplam5 = " + toplam5);//12

        int toplam6 = (int) toplam3;
        System.out.println("toplam6 = " + toplam6);//12+
    }
}