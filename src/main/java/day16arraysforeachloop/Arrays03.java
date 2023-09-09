package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        // Ornek 1 : Integer bir array olusturunuz, icine 6 eleman yerlestiriniz. Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        int ages [] = new int[6];

        ages [0] = 20;
        ages [1] = 23;
        ages [2] = 19;
        ages [3] = 44;
        ages [4] = 15;
        ages [5] = 32;

        System.out.println(Arrays.toString(ages));

        // 1. Yol
        // sort method u array deki elemanlari kucukten buyuge dizer.

        Arrays.sort(ages); // kucukten buyuge siralama.

        System.out.println(Arrays.toString(ages));

        System.out.println(ages [0] + ages[ages.length - 1]);

        // 2. Yol

        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {

            minimum = Math.min(minimum , w);

            maximum = Math.max(maximum , w);

        }

        System.out.println(minimum);

        System.out.println(maximum);

        System.out.println("En buyuk sayi = " + maximum +"\nEn kucuk sayi = " +minimum);

        // Ornek 2 : String bir array olusturunuz 6 eleman ekleyiniz, yellow dan onceki elemalari yazdiriniz.

        String colours[] = new String [6];

        colours [0] = "Red";
        colours [1] = "Orange";
        colours [2] = "Blue";
        colours [3] = "Yellow";
        colours [4] = "Green";
        colours [5] = "Brown";

        System.out.println(Arrays.toString(colours));

        for (String w : colours) {

            if (w.equals("Yellow")){

                break;

            }

            System.out.println(w);

        }



    }

}