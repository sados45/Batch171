package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        // Bir Array in elemanlari Array ise bu Array ler Multidimensional  Arraydir.

        // Multidimensional Array nasil olusturulur.

        int a [][] = new int[3][2];

        // Multidimensional Array de elemanlar nasil olusturulur.

        a [0] [0] = 5;
        a [1] [1] = 45;
        a [2] [0] = 123;
        a [0] [1] = 12;
        a [1] [0] = 81;
        a [2] [1] = 0;

        System.out.println(Arrays.toString(a)); // Array deki elemanlarin adresini gosterir
        System.out.println(Arrays.deepToString(a)); // Multidimensional Array in elemanlarini gosterir.

        // Multidimensional Array icinden specific bir eleman nasil yazdirilir.

        System.out.println(a [1] [1]); // 45
        System.out.println(a [2] [0]); // 123

        // Multidimensional Array icindeki Array nasil yazdirilir.

        System.out.println(Arrays.toString(a [0])); // [5, 12]
        System.out.println(Arrays.toString(a [2])); // [123, 0]

        String students[][] = {{"Ali", "Ummu"}, {"Emine", "Bunyamin"}, {"Ibrahim"}, {"Nesibe", "Ubeyd"}};

        // Ornek 1 : Yukaridaki students Array inde toplam kac tane isim dolugunu bulunuz

        int sum = 0;
        for (String[] w : students) {

            sum += w.length;

        }

        System.out.println(sum);


    }

}