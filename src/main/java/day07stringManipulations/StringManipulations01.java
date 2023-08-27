package day07stringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

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
        10) Sadece space karakteri --> \\s
            Space karakteri haric --> \\S
            Sadece rakamlar --> \\d
            Rakamlar haric --> \\D
         */

        String t1 = t.replaceAll("[0-9]","*");

        System.out.println("s1 = " + t1); // Ali ** yasindadir!...

        System.out.println("----------");

        //Ornek 2 : "t" Stringindeki tum rakamlari ve harfleri "!" e ceviriniz

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");

        System.out.println("s2 = " + t2);

        System.out.println("----------");

        //Ornek 3 : "t" Stringindeki tum sesli harfleri "?" donusturunuz.

        String t3 = t.replaceAll("[aeiouAEIOU]","?");

        System.out.println("t3 = " + t3);

        System.out.println("----------");

        //Ornek 4 : "t" Stringindeki kucuk harfler dısındaki tum karakterleri "<>" ceviriniz.

        String t4 = t.replaceAll("[^a-z]","<>");

        System.out.println("t4 = " + t4);

        System.out.println("----------");

        //Ornek 5 : "t" Stringindeki tum harfler disindaki tum karakterleri "+" yapiniz.

        String t5 = t.replaceAll("[^a-zA-Z]","+");

        System.out.println("t5 = " + t5);

        System.out.println("----------");

        //Ornek 6 : "t" Stringindeki space ler disindaki tum karakterleri "?" yapiniz.

        String t6 = t.replaceAll("[\\S]","+");

        System.out.println("t6 = " + t6);

        System.out.println("----------");

        //Ornek 7 : "t" Stringindeki sesli harfler disindaki tum karakterleri "&" ceviriniz.

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");


    }
}