package day07stringManipulations;

import java.util.Scanner;

public class StringManipulations02 {

    public static void main(String[] args) {

    /* Ornek : Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz.
            1) En az 8 karakter olsun
            2) Space karakteri olmasin
            3) En az bir buyuk harf olsun
            4) En az bir kucuk harf olsun
            5) En az bir rakam olsun
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen password giriniz.");

        String password = input.nextLine();

        // 1

        boolean first = password.length()>=8;

        System.out.println("En az 8 karakter var mi = " + first);

        System.out.println("----------");

        // 2

        boolean second = !password.contains(" ");

        System.out.println("Space yok mu = " + second);

        System.out.println("----------");

        // 3

        // Methodlari ayni satirda yan yana kullanmaya method chain denilir.
        boolean third = password.replaceAll("[A-Z]","").length()>0;

        System.out.println("third = " + third);

        System.out.println("----------");

        // 4

        boolean fourth = password.replaceAll("[a-z]","").length()>0;

        System.out.println("forth = " + fourth);

        System.out.println("----------");

        // 5

        boolean fifth = password.replaceAll("[1-9]","").length()>0;

        System.out.println("fifth = " + fifth);

        System.out.println("----------");

        boolean sixth = first && second && third && fourth && fifth;

        System.out.println("Password gecerli mi?   " + sixth);

    }

}