package day10ifstatements;
import java.util.Scanner;

public class IfStatements01 {

    public static void main(String[] args) {

        // Ornek : Verilen bir sayinin pozitif, veya notr oldugunu kontrol eden kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        int number = input.nextInt();

        if (number > 0){

            System.out.println(number + " pozitiftir.");

        } else if (number == 0) {

            System.out.println(number + " notrdur.");

        }else {

            System.out.println(number + " negatiftir.");

        }

    }

}