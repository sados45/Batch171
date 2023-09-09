package day17arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // Array leri kisa yoldan nasil olusturabiliriz?

        int arr [] = {63 , 7 , 312 , 8 , 4};

        System.out.println(Arrays.toString(arr));

        System.out.println("----------");

        // Ornek 1 : Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int sayac = 0;

        for (int w : arr) {

            if (w % 2 == 0) {

                sayac++;

            }

        }

        System.out.println("Array de " + sayac + " adet cift sayi " + (arr.length-sayac) + " adet tel sayi kullanilmistir.");

        System.out.println("----------");

        // Ornek 2 : Size verilen bir string array deki isimlerden 5 karakterden az karakter icerenleri konsola yazdiriniz.

        String arr2 [] = {"Bunyamin" , "Emine" , "Hatice" , "Serdar" , "Ibrahim"};

        for (String w : arr2) {

            if (w.length() < 7) {

                System.out.println(w);

            }

        }

        System.out.println("----------");

        // Ornek 3 : Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan isimler haric diger
        // isimleri console a yazdiriniz.
        // Note 1 : sort() method u sayisal data type larini kucukten buyuge siralar (ascending order)
        // Note 2 : sort() method u string data type larini alfabetik olarak siralar (alphabetical order)
        // Note 3 : ascending order ve + alphabetical order --> Natural Order
        // Note 4 : sort() method unun array elemanlarini Natural Order a gore siralar.

        String arr3 [] = {"Ajda" , "Ayhan" , "Cuneyt" , "Filiz" , "Tom"};

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));

        for (String w : arr3) {

            if (w.startsWith("F")) {

                continue;

            }

            System.out.println(w);

        }

    }

}