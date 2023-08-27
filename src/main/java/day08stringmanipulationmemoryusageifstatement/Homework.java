package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

    /*
        Homework

        1) Bir String variable olusturunuz ve bu stringdeki rakam olmayan tum karakterlerin sayisini
        konsola yazdiriniz.

        2) Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tüm karakterleri
        konsola buyuk harflerle yazdiriniz.

        3) Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ASCII degerleri
        toplamini console a yazdiriniz.

        4) Tek kelimeli bir sehir ismi icin String variable olusturun ve sehir isminin ilk harfini
        buyuk harfle diger harflerini kucuk harflerle konsola yazdirin.

        5) Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.
            a) En az 6 karakter olmali.
            b) En az bir tane buyuk harf olsun
            c) en az bir tane kucuk harf olsun
            d) En az bir tane rakam olsun.

     */

        // 1

        String variable = "Ben 6 ayda java ogreniyoruM";

        int variableLength = variable.length();
        int varWithoutNumber = variable.replaceAll("[0-9]","").length();

        System.out.println("Cumledeki toplam karakter sayisi = " + variableLength);

        System.out.println("Cumlenin rakam olmadan karakter sayisi = " + varWithoutNumber);

        System.out.println("----------");

        // 2) Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tüm karakterleri
        // konsola buyuk harflerle yazdiriniz.

        String midWords = variable.toUpperCase().substring(1,variableLength-1);

        char firstLetter = variable.toLowerCase().charAt(0);

        char lastLetter = variable.toLowerCase().charAt(variable.length()-1);

        System.out.println("Istenilen deger = " + firstLetter + midWords + lastLetter);

        System.out.println("----------");

        // 3Bir String variable olusturunuz ve bu Stringdeki ilk ve son karakterlerin ASCII degerleri
        // toplamini console a yazdiriniz.

        char firstLetter2 = variable.charAt(0);

        char lastLetter2 = variable.charAt(variableLength-1);

        int lettersAddition = firstLetter2 + lastLetter2;

        System.out.println("lettersAddition = " + lettersAddition);

        System.out.println("----------");

        // 4) Tek kelimeli bir sehir ismi icin String variable olusturun ve sehir isminin ilk harfini
        // buyuk harfle diger harflerini kucuk harflerle konsola yazdirin.

        String city = "bERLIN";

        char cityFLC = city.toUpperCase().charAt(0);
        String cityLC = city.toLowerCase().substring(1,city.length());

        System.out.println("Sehir ismi = " + cityFLC + cityLC);

        System.out.println("----------");

        // 5) Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.
        //      a) En az 6 karakter olmali.
        //      b) En az bir tane buyuk harf olsun
        //      c) en az bir tane kucuk harf olsun
        //      d) En az bir tane rakam olsun.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir parola belirleyiniz");

        String password = input.nextLine();

        boolean firstReq=password.length()>5;

        boolean secondReq=password.replaceAll("[^A-Z]","").length()>0;

        boolean thirdReq=password.replaceAll("[^a-z]","").length()>0;

        boolean fourthReq=password.replaceAll("[^0-9]","").length()>0;

        System.out.println("firstReq = " + firstReq);

        System.out.println("secondReq = " + secondReq);

        System.out.println("thirdReq = " + thirdReq);

        System.out.println("fourthReq = " + fourthReq);

        System.out.println("are every requirement met "+ (firstReq && secondReq && thirdReq && fourthReq));

    }

}
