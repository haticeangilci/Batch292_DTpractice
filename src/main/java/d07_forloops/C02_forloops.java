package forloops02;

public class C02_forloops {
    public static void main(String[] args) {
        /*

         ****
         *    *
         *    *
         *    *
         ****

         */
        int satir=9;
        for (int i = 1; i <=satir ; i++) {//bulundugumuz satir sayisi
            if (i==1||i==satir){
                for (int j = 1; j <satir ; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 1; j <=satir+1 ; j++) {
                    if (j==1||j==satir+1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }



    }
}