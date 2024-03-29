package day15loops;
import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        /*
        Example 1: Asagidaki sekli cizen kodu yaziniz
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir (row ) sayisini giriniz...");

        int row = input.nextInt();

        for (int i = 1 ; i <= row ; i++) {

            for (int j = 1 ; j <= i ; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

        // Ornek 2 : 23 den 12 ye kadar cift tam sayilari console a yazdiriniz.

        int j = 23;

        while (j > 11) {

            if (j % 2 == 0) {

                System.out.print(j + " ");

            }

            j--;

        }

        System.out.println();

        // Ornek 3 : 6 dan 19 a kadar tek tamsayilari console a yazdriniz.

        int k = 6;

        while(k < 20) {

            if (k % 2 != 0) {

                System.out.print(k + " ");

            }

            k++;

        }

        System.out.println();

    }

}