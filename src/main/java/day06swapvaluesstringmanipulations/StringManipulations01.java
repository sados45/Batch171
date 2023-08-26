package day06swapvaluesstringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        //String bir non-primitive data type dir ve ayni zamanda bir class dir.

        String s = "Java is easy";

        System.out.println("----------");

        // Ornek 1 : "s" Strindeki tum karakterileri buyuk harf yapiniz.

        String sUpper = s.toUpperCase();

        System.out.println("sUpper = " + sUpper);

        System.out.println("----------");

        // Ornek 2 : "s" Strindeki tum karakterileri buyuk harf yapiniz.

        String sLower = sUpper.toLowerCase();

        System.out.println("sLower = " + sLower);

        System.out.println("----------");

        // Ornek 3 : "s" Strindeki ilk karakteri aliniz.

        char firstLetter = s.charAt(0);

        System.out.println("firstLetter = " + firstLetter);

        System.out.println("----------");

        // Ornek 4 : "s" Stringindeki bastan 2. ve sondan 2. karakteri alin yazdirin.

        char secondLetter = s.charAt(1);

        char tenthLetter = s.charAt(10);

        System.out.println("secondLetter = " + secondLetter);

        System.out.println("tenthLetter = " + tenthLetter);

        System.out.println("----------");

        // Ornek 5 : "s" Stringinde kullanilan karakter sayisini bulunuz.

        int sLength = s.length();

        System.out.println("sLength = " + sLength);

        System.out.println("----------");

        // Ornek 6 : "s" Stringindeki ilk 4 karakteri aliniz.
        // s.substring(0, 4); --> kullaniminda ilk index dahildir, ikinci index dahil degildir.

        String sub = s.substring(0,4);

        System.out.println("sub = " + sub); // Java

        System.out.println("----------");

        // Ornek 7 : "s" Stringindeki "is" gormek icin gerekli kodu yaziniz.

        String sub2 = s.substring(5,7);

        System.out.println("sub2 = " + sub2); // is

        System.out.println("----------");

        // Ornek 8 : "s" Stringindeki "easy" gormek icin gerekli kodu yaziniz.

        String sub3 = s.substring(8,12);

        System.out.println("sub3 = " + sub3); // easy

        System.out.println("----------");

        // 2. Yol

        String sub4 = s.substring(8); // easy

        System.out.println("sub4 = " + sub4);

        System.out.println("----------");

        //Ornek 9 : "s" Stringinde "money" kelimesi varmi yok mu kontrol ediniz.

        boolean isExist = s.contains("");

        System.out.println("isExist = " + isExist); // true

        System.out.println("----------");

        //Ornek 10:  "s" String'inin belli bir harfle ya da harflerle baslayip baslamadigini kontrol ediniz.

        boolean isStarts = s.startsWith("Java");

        System.out.println("isStarts = " + isStarts);

        System.out.println("----------");

        // Ornek 11 : "s" Stringinin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile
        // baslayip baslamadigini kontrol eden kodu yaziniz.

        boolean startsWith = s.startsWith("i",5);

        System.out.println("isStarts = " + isStarts);

        System.out.println("----------");

        // Ornek 11 : "s" Stringinin 2. index dahil olmak uzere bu indexten itibaren "v" karakteri ile
        // baslayip baslamadigini kontrol eden kodu yaziniz.

        boolean startsWith2 = s.startsWith("v",2);

        System.out.println("startsWith2 = " + startsWith2);

        System.out.println("----------");

    }

}
