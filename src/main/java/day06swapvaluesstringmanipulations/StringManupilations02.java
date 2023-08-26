package day06swapvaluesstringmanipulations;

public class StringManupilations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        // Ornek 1 : "s" String inin "money" ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith("money");

        System.out.println("isEnd = " + isEnd);

        System.out.println("----------");

        // Ornek 2 : "s" String indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String s1 = s.replace("money","dollar");

        System.out.println("s1 = " + s1);

        System.out.println("----------");

        // Ornek 3 : "s" String indeki "earn" kelimesini "get" kelimesine ceviriniz.

        String s2 = s.replace("earn","get"); //!!!!!!!!!!! YANLIS DIKKAT !!!!!!!!!!!

        System.out.println("s2 = " + s2);

        System.out.println("----------");

        // Ornek 4 : "s" String indeki "a" harflerini "*" a ceviriniz.

        String s3 = s.replace('a','*');

        System.out.println("s3 = " + s3);

        System.out.println("----------");

        // Ornek 5 : "s" String indeki "n" harflerini "xxx" a ceviriniz.

        String s4 = s.replace("n","xxx");

        System.out.println("s4 = " + s4);

        System.out.println("----------");

        // Ornek 6 : "s" String indeki "e" harflerini siliniz.

        String s5 = s.replace("e","");

        System.out.println("s5 = " + s5);

        System.out.println("----------");

        String t = "Ali 13 yasindadir!...";
        // Ornek 7 : "t" Stringindeki tum rakamlari "*" ceviriniz
        // Note : Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz.
        // Note : Bir grup datayi degistirmek icin replaceAll() kullanilir.

        /*
                        Regex
        1) Tum Rakamlar --> [0-9]
        2) Tum kucuk harfler --> [a-z]
        3) Tum buyuk harfler --> [A-Z]
        4) Tum kucuk ve buyuk harfler --> [a-zA-Z]
        5) Tum harfler ve rakamlar --> [a-zA-Z0-9]
        6) Tum noktalama isaretleri --> \\p{Punct}
        7) Tum sesli harfler --> [aeiouAEIOU]
           Tum x, q, w harfleri --> [xqw]
        8) Kucuk harflerden farkli tum karakterler --> [^a-z]
        9) Tum harflerden farkli tum karakterler --> [^a-zA-Z]
         */

        String s6 = t.replaceAll("[0-9]","*");

        System.out.println("s6 = " + s6); // Ali ** yasindadir!...





    }

}
