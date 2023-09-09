package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Ornek 1 : String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi karakter sayilari toplamini yazidiriniz

        String arr [] = new String[5];

        arr [0] = "Math";
        arr [1] = "Science";
        arr [2] = "Music";
        arr [3] = "English";
        arr [4] = "Art";

        Arrays.toString(arr);

        int firstLength = arr [0].length();
        int lastLength = arr [arr.length-1].length();

        System.out.println(firstLength + lastLength);

        // Ornek String bir array olusturun icine 5 tane eleman ekleyin, tum elemanlarin icerdigi karakter sayilarinin toplamini yazdiriniz

        String cities [] = new String [5];

        cities [0] = "Istanbul";
        cities [1] = "Miami";
        cities [2] = "Ankara";
        cities [3] = "Oslo";
        cities [4] = "Erzurum";

        // 1. Yol for loop

        int totalChar = 0;

        for (int i = 0; i < cities.length ; i++) {

            totalChar += cities[i].length();

        }

        System.out.println(totalChar);

        // 2. Yol for each loop (enhanced loop --> zenginleştirilmiş loop)
        // baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for each loop "Array" lerde ve "Collection" larda kullanilir.

        /*
        for (DataType w --> (variable name) : arr/collection) {
            calisacak kodlar
        }
        */

        int sum = 0;

        for (String w : cities) {

            sum += w.length();

        }

        System.out.println(sum);

        // Ornek 3 : Notlar adinda bir Integer array olusturunuz. Icıne 6 tane not yerlestiriniz ve not ort. ekrana aliniz.

        int notes [] = new int[6];

        notes [0] = 50;
        notes [1] = 70;
        notes [2] = 60;
        notes [3] = 40;
        notes [4] = 90;
        notes [5] = 80;

        System.out.println(Arrays.toString(notes));

        int addition = 0;

        for (int w : notes) {

            addition += w;

        }

        System.out.println(addition / notes.length);

    }

}