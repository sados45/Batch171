package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        // Örnek: Kullanicidan bir dikdörtgenin iki kenarin uzunluklarini aliniz.
        // A) alanini hesaplayiniz. ===> Kisa * Uzun Kenar
        // B) cevresini hesaplayiniz. ===> 2 * Kisa kenar + 2 * Uzun Kenar

        Scanner input = new Scanner(System.in);

        System.out.print("Dikdörtgenin kisa kenar uzunlugunu giriniz : ");

        double shortSide = input.nextDouble();

        System.out.print("Dikdörtgenin uzun kenar uzunlugunu giriniz : ");

       double longSide = input.nextDouble();


        System.out.println("Alan =" + shortSide * longSide);

        System.out.println("Cevre = " + (2 * shortSide + 2* longSide));


    }
}
