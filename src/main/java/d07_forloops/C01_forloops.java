package forloops02;

public class C01_forloops {
    public static void main(String[] args) {
        /*
        dongu sayisi belli mi --> evet --> for dongusu kullanıcaz peki bir coklu data mi yazdirilcak -- evet --> foreach
        |                                                                                      |
        |                                                                                      |
        |                                                                                      ↓
        ↓                                                                                      Hayır-->   forloop(index varsa daima forloops)
        hayır --> while Loop --> en az bir calisması gerekiyor mu --> evet --> do While loop
                                                                |
                                                                |
                                                                ↓
                                                                hayır --> while loops


         *******
         *      *
         *      *
         *******
         *      *
         *      *
         *******

         */
        int satir=7;
        for (int i = 1; i <=satir ; i++) {//bulundugumuz satir sayisi
            if (i==1||i==satir/2+1||i==satir){
                for (int j = 1; j <=satir ; j++) {
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