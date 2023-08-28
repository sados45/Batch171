package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        // Ornek : Verilen karakter buyuk harf ise ekrana buyuk harf yazdiran kucuk harf ise kucuk harf
        // yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char ch = input.next().charAt(0);

        // 1. Yol

        if (ch >= 'A' && ch <= 'Z'){

            System.out.println("Buyuk Harf.");

        }

        if (ch >= 'a' && ch <= 'a'){

            System.out.println("Kucuk Harf.");

        }

        // 2. Yol

        if (ch >= 'A' && ch <= 'Z'){

            System.out.println("Buyuk Harf.");

        }else if (ch >= 'a' && ch <= 'a'){

            System.out.println("Kucuk Harf.");

        }else{

            System.out.println("Harf Degil.");

        }

    }

}