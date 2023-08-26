package day05concatenationoperationstypecasting;

public class Concatenation {

    public static void main(String[] args) {

        //Ornek 1 : Bir string ve 2 integer variable olusturun. String degeri ile Integer larin toplamini console a yazdirin.

        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b); //elma1011

        System.out.println(s + (a + b)); //elma21

        System.out.println(s + a * b); //elma110

        System.out.println(a + b + s); //21elma

        System.out.println(a + s + b); //10elma11

        //Java'da "+" sembolu 2 sayi arasinda kullanilirsa toplama islemi gorevini gorur.
        //Java'da "+" sembolu iki string arasinda ve ya bir string bir sayi arasinda kullanilirsa "concatenation" islemi olur.
        //"Concatenation" birlestirme yapar.
        //Note : Concatenation islemlerinde java matematik teki islem onceligini bilir.
        /*
        Matematikte islem onceligi
        1) Once uslu sayilar
        2) Parantez ici islemler yapilir
        3) Carpma ve Bolmeler yapilir
        4) Toplama ve cikarmalar yapilir
        5) Ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2 :Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz.

        String shirt = "2300";
        String shoes = "5200";

        System.out.println(shirt + shoes);

        //Integer.valueOf() string degerleri int e cevirir.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat); //7500

        //Ornek 3 : Size String olarak verilen 2 fiyatin toplamini ekrana yazdiriniz.

        String tv = "$1100";
        String radio = "$300";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);

        System.out.println(totalPrice);

        //Note : valueOf() methodu tum karakterileri rakam olan String leri sayilara cevirir
        //Eger valueOf() kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alarsiniz.
        //valueOf() method u kullanilirken sadece rakam olan karakterler kullanilmalidir.


    }

}