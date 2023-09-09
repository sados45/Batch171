package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 13;
        // Bu yapinin icinde sadece bir adet data depolanabilir.
        // Ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        // Bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur.

        // Array nasil olusturulur?
        // toString() methodu mu kullanmadan sadece array ismi

        String stdNames [] = new String[5];

        System.out.println(Arrays.toString(stdNames));

        /*
        Array ler diger collection lardan cok cok hizlidir (superfast).
        Array ler diger collection lardan daha az memory kullanirlar.
         */

        // Array eleman ekleme nasil yapilir?

        stdNames [2] = "Benna";

        System.out.println(Arrays.toString(stdNames));

        stdNames [3] = "Abdullah";
        stdNames [4] = "Recep";
        stdNames [0] = "Ekim";
        stdNames [1] = "Bunyamin";

        System.out.println(Arrays.toString(stdNames));

        // Array den specific bir elemani nasil aliriz?

        System.out.println(stdNames[1]);

        // Ornek 1 : Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz.
        // length() Stringlerde method (parantezli), Array lerde ise parantezsiz yazilir. (method degil)
        for (int i = 0; i < stdNames.length ; i++) {

            System.out.println(stdNames[i] + "!");

        }


    }

}