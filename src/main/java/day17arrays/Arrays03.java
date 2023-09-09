package day17arrays;
import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        // Specific bir eleman array de olup olmadigini anlamak icin gereken kodu yaziniz.

        String names [] = {"K" , "C" , "R" , "A" , "S"};
        String el = "X";

        // 1. Way

        int counter = 0;

        for (String w : names) {

            if (w.equals(el)) {

                counter++;

                break;

            }

        }

        if (counter > 0) {

            System.out.println("Array has " + el);

        } else {

            System.out.println("Array does not have " + el);

        }

        System.out.println("----------");

        /*
        1) binarySearch() method unu sort() kullanmadan kullanmayiz, cunku binarySearch() mantigi sirali elemanlar icin gecerlidir.
        2) binarySearch() method u var olan elemanlar icin size o elemanin indexini verir.
        3) binarySearch() method undan aldiginz index 0 veya 0dan buyuk ise bu o eleman array de var demektir.
        4) binarySearch() method u olmayan elemanlar icin negatif tam sayi degeri verir.
        5) "-" isaretinin anlami o eleman yok demektir.
        6) "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
         */

        // 2. Way binarySearch() method u hizli calisir

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);

        if (result < 0) {

            System.out.println("Array does not have " + el);

        } else {

            System.out.println("Array has " + el);

        }

        System.out.println(Arrays.toString(names));

        int num1 = Arrays.binarySearch(names,"A");
        System.out.println(num1); // 0 --> var hemde index sifirdir

        int num2 = Arrays.binarySearch(names,"K");
        System.out.println(num2); // 2 --> var hemde index ikidir.

        int num3 = Arrays.binarySearch(names,"U");
        System.out.println(num3); // -6 --> yok, olsaydi index alti olacakti.


    }

}