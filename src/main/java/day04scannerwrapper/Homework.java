package day04scannerwrapper;

import java.util.Scanner;

public class Homework {

     /*
        Homework

        1) Kullanicidan aldiğiniz 3 tane sayinin ortalamasini bulan kodu yaziniz.
        2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz.
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;
        double number3;
        int number4;
        int a;
        int b;
        int c;
        int addition;

        System.out.println("Lütfen 3 adet sayi giriniz.");

        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        System.out.println("Girdiginiz sayilarin aritmetik ortalamasi = " + (number1 + number2 + number3)/3);

        System.out.println("Lütfen 3 basamakli bir sayi giriniz.");

        number4 = input.nextInt();

        a = number4 % 10;

        number4 = number4 / 10;

        b = number4 % 10;

        number4 = number4 / 10;

        c = number4 % 10;

        addition = a + b + c;

        System.out.println("Girdiginiz sayinin rakamlari toplami = " + addition);

    }

}