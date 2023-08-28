package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        // Ornek 1 : Kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz.
        // 1. Yol

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz.");

        int number = input.nextInt();

        if (number % 2 == 0){

            System.out.println("Girilen sayi cifttir!");

        }

        if (number % 2 != 0){

            System.out.println("Girilen sayi tektir!");

        }

        System.out.println("----------");

        // 2. Yol

        if (number % 2 == 0){

            System.out.println("Girilen sayi cifttir!");

        }
        else {

            System.out.println("Girilen sayi tektir!");

        }

    }

}
