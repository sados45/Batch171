package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {

    public static void main(String[] args) {

        // Ornek 1 : Bir string in karakter icermedigini (Bos string oldugunu) kontrol eden kodu giriniz.
        // length() methodu ile cozum
        String str = "";

        boolean result1 = str.length() == 0;

        System.out.println("String bos mu? " + result1);

        System.out.println("----------");

        // 2. Yol

        // Java eger bir konuda method olusturduysa, o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();

        System.out.println("is Empty? " + result2);

        System.out.println("----------");

        //Ornek 2 : Bir string in space haric hiçbir karakter icermedigini kontrol eden kodu giriniz.

        // 1. Yol
        String t = "      ";

        boolean result3 = t.replace(" ","").length() == 0;

        System.out.println("result3 = " + result3);

        System.out.println("----------");

        // 2. Yol

        boolean result4 = t.replace(" ","").isEmpty();

        System.out.println("result4 = " + result4);

        System.out.println("----------");

        // 3. Yol

        // isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir karakter
        // varsa false verir.
        // isBlank() methodu bos Stringler icin de true verir.
        // isBlank() methodu space ve hicbisey icin true verir.
        // isEmpty() methodu sadece hicbirsey icin true verir.

        boolean result5 = t.isBlank();

        System.out.println("result5 = " + result5);

        System.out.println("----------");

        // Ornek 3 : Bir stringde a, i, e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        // "Java is easy to learn" -->  1 + 5 + 8 = 14
        //  0123456789...

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a'); // 1

        int idxI = r.indexOf('i'); // 5

        int idxE = r.indexOf('e'); // 8

        int idxTotal = idxA + idxI + idxE;

        System.out.println("idxTotal = " + idxTotal); //14

        System.out.println("----------");

        // Ornek 4 : Bir stringdeki "Java kelimesi" nin ilk olarak kacıncı indexte kullanildigini gosteren kodu yaziniz.
        // "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J'nin) indexini alir.

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("java"); // 3

        System.out.println("idxJava = " + idxJava);

        //indexOf() methodu olmayan karakterler icin kullanilirsa her zaman -1 return eder.
        int idxjava = u.indexOf("java"); // -1

        System.out.println("----------");

        // Ornek 5 : Bir stringde a, i, e karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz

        String v = "Java is easy to learn";

        int idxOfa = v.lastIndexOf('a');

        System.out.println("idxOfa = " + idxOfa); // 18

        int idxOfe = v.lastIndexOf('e');

        System.out.println("idxOfi = " + idxOfe); // 17

        int idxOfi = v.lastIndexOf('i');

        System.out.println("idxOfi = " + idxOfi); // 5

        int idxOfTotal = idxOfi + idxOfe + idxOfa;

        System.out.println("idxOfTotal = " + idxOfTotal); // 40

        System.out.println("----------");

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.


    }

}
