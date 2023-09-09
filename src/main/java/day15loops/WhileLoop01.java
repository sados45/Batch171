package day15loops;

public class WhileLoop01 {

    public static void main(String[] args) {

        // Kalibini olusturalim
        /*
        for kalibi
        for (baslangic degeri ; loop calisma kurali ; artirma / azaltma) {
            calisacak kodlar
            }
         */

        // while loop kalibi

        /*
        baslangic degeri
        while (loop calisma kurali) {

            calisacak kodlar

            artirma / azaltma
            */

        //Ornek 1 : 3 den 6 ya kadar tamsayilari console a yazdiriniz.
        // 1. Yol : for loop

        for (int i = 3 ; i < 7 ; i++) {

            System.out.print(i + " ");

        }

        System.out.println();

        //2. Yol : while loop

        int i = 3;

        while (i < 7) {

            System.out.print(i + " ");

            i++;

        }

        System.out.println();

    }

}