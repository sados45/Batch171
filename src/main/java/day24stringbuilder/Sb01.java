package day24stringbuilder;

public class Sb01 {

    public static void main(String[] args) {

        /*
        1) String builder class i da string ureten bir class tir.
        2) String class kullanarak string uretiriz java nicin StringBuilder class i olusturdu?
            String class "immutable" (degistirilemez) string uretir.
            StringBuilder "mutable" (degistirilebilir) string uretir.
        3) "Immutable" olmak demek original degerin korunmasi, degistirilemez olmasi demektir.
           "mutable" olmak demek original degerin degistirilebilir olmasi demektir.
        */

        // Immutable

        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        // String i degistirdikten sonra ayni String e assignment ederseniz Jaba yine yeni bir container olusturur.
        // Degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirilir.
        // Dolayisiyla eski container adressiz kalir ve garbage collector adressiz olan contanirlari siler

        String a = "Money";
        a += "More";

        // Mutable
        // StringBuilder kullanarak string uretmenin 1. yolu :

        StringBuilder sb1 = new StringBuilder("Python");

        System.out.println(sb1); // Python

        sb1.append("!");

        System.out.println(sb1); // Python!

        // StringBuilder kullanarak string uretmenin 2. yolu :

        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length()); // 0

        System.out.println(sb2.capacity()); // 16

        sb2.append("Java");
        sb2.append("XXXXXXXXXXXXXXX"); // 15 tane X

        System.out.println(sb2.length()); // 19

        System.out.println(sb2.capacity()); // 34

        // capacity() ve length() arasindaki fark nedir?
        /*
        capacity() javanin size verdigi data depolama yer sayisidir.
        length() ise size verilen daya depolama yerinin kullanilan kismidir.

        Java baslangic kismi olarak size capacity i 16 olarak verir.
        Siz verilen capacity i asarsaniz Java yeni capacity i varolanin 2 katinin 2 fazlasi seklinde cogaltir.
        16 --> 16 * 2 + 2 = 34 --> 34 * 2 + 2
         */

        // Default capacity i nasil degistirebliliriz?

        StringBuilder sb3 = new StringBuilder(3);

        sb3.append("ali");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());


    }

}