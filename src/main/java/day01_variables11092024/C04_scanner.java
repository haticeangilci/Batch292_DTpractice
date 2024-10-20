package day01_variables11092024;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapını yazınız: ");

        double r = input.nextDouble();

        System.out.println("Cevre = " + String.format("%.2f",2*Math.PI*r));
        System.out.println("Alan = "  + String.format("%.2f",Math.PI * (Math.pow(r, 2))));
        //Math classı jave içerisindeki matematik ile ilgili işlemlerin yetersiz olduğu durumlarda kullanılan matematik classıdır!!
        // Math.pow(r,2);//r kare dir
        //System.out.println("Math.PI = " + Math.PI);





    }
}
