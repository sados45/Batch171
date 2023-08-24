package day01variables;

public class Variables01 {

    public static void main(String[] args) {


        // java bu satiri okumaz, kendimize ve baskalarina aciklama satiridir.

        /*
        java bu satiri da okumaz
        */

        //Variable nasil olusturulur?
        //Once data type soylemek gerekiyor.
        //Data type + variable name + Assignment Operator (atama motoru) + Variable degeri + noktali virgül

        int age = 13;   // Variable Decleration int age
        // Assignment = 13;

        //java cumlesi -> statement
        // Dil bilisimindeki nokta ne ise Javadaki ";" ayni seydir
        //Yani statement in bitigini soyler.
        //Eger variable declaration yapar, Assigment yapmazsaniz java kendi default degerini koyar.
        //Default deger sayilar icin sifirdir.
        //Javada "=" assignment operator dir. Java bu operator u gordugu zaman once sag tarafi calistirir.
        //Daha sonra sagdaki degeri alir soldaki data type a atama yapar.
        // Javada esittir demek "==" Matematikteki "="

        /*
        Javada temelde 2 tip data vardir.

            1)Primitive data type:
                int
                char
                double
                boolean
                byte
                short
                long
                float
            2)non-primitive data type:
                String
                Sayisi yok
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup Ali Can atayiniz.

        String ogrenciAdi = "Ali Can";

        //String lere verilen degerler daima cift tirnak icinde yazilmalidir.
        //String default deger olarak null atar. (hiclik, ici bos obje.)
        /*
        String bir variable olusturdugumuzda cogu zaman ona bir deger atariz.
        Atama yapmazsak, java o variable a varsayilan deger olarak null koyar.
        null demek 0 demek degildir. 0 da coding dilinde bir degerdir, null
        hiclik demektir. İcinde variable yada method bulunmayan bos bir objedir.
        */

        //char data type
        //TEK karakterler icin kullanilir. Sayi, sembol ya da harf farketmez.
        //ornegin --> A, x, ?, 5,...

        //Ornek 2: char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.

        char isminIlkHarfi = 'A';
        char alfabeSonHarf = 'z';

        //char data type inda degerler daima tek tirnak ' ' icinde yazilmalidir.

        //boolean data type:
        //boolean lar sadece iki farkli deger alabilir; true veya false
        //Ornek 3: boolean data tipinde emekli misin sorusu icin bir variable olusturun ve false degeri atayin

        boolean isRetired = false;

        //byte data type
        //tam sayilar icin kullanilir, hafizada 1 byte yer kaplar.
        //byte : -128 den +127 ye (dahil) sayilar icin kullanilir.

        //Ornek 4 : byte data tipi icin ogrenci yasi icin deger olusturunuz ve deger atayiniz.

        byte ogrenciYasi = 24;

        //short data type
        //tam sayilar icin kullanilir, hafizada 2 byte yer kaplar.
        //short : -32768 den +32767 ye (dahil) sayilar icin kullanilir.

        //Ornek 5 : Site nufusu icin bir variable olusturup deger atayiniz.

        short siteNufusu = 1300;

        //int data type
        //tam sayilar icin kullanilir, hafizada 4 byte yer kaplar.
        //int : -2,147,483,648 den +2,147,483,647 ye (dahil) sayilar icin kullanilir.

        //Ornek 6 : Ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz.

        int ulkeNufusu = 131313131;

        //long data type
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar.
        //int : -9,223,372,836,854,775,808 den +9,223,372,836,854,775,807 ye (dahil) sayilar icin kullanilir.

        //Ornek 7 : Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        //Note: Bir deger long ise sonuna "L" veya "l" konulur
        long hucreSayisi = 183486543218945341L;

        //Eger long a atadiginiz deger int lerin araliginda ise sonuna "L" koymaya gerek yoktur.
        //long dememize ragmen sonuna L koymazsak eger java onu int olarak kabul eder.
        long weightOfSun = 1234562456;

        //float data type
        //float virgullu sayilar (Decimal Numbers --> Ondalikli sayilar) icin kullanilir.
        //Virgullu sayilar icin kullanilir, hafizada 4 byte yer kaplar.

        //Ornek 8 : Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturun.

        //Java ondalikli sayilari otomatik olarak "double" kabul eder.
        //Siz data type ini float yazarsaniz hata alirsiniz, float olmasinda israr ediyorsaniz sonuna "F" yada "f" koymalisiniz.
        float ayakkabiFiyat = 799.99F;
        float gomlekFiyat = 299.99f;

        //double data type
        //Virgullu sayilar icin kullanilir, hafizada 8 byte yer kaplar.
        //Ondalikli kismi icin daha fazla rakam alabilir.

        //Ornek 9 : Hucre agirligi ve Amipin agirligi icin iki tane variable olusturunuz.

        double hucreAgirligi = 10.1856524;
        double amipAgirligi = 25.56432189;

        //Ornek 10 : Ogrenci notlari icin 2 adet variable olusturunuz ve toplamlarini ekrana yazdiriniz.

        byte note1 = 50;
        byte note2 = 70;

        System.out.print(note1); //ekrana yazdirir.
        System.out.print(note2); //ekrana yazdirir.

        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar.
        //System.out.print();   ekrana yazdirir ve pointer i ayni satirda tutar.


    }


    }
