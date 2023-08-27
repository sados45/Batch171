package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {

    public static void main(String[] args) {

        // if statements
        // bazi kodlari bazi sartlara gore aktive edebilmek icin if statement kullanilir.

        // Ornek 1 : Sayi pozitif ise ekrana pozitif yazdirin.

        int num = -13 ;

        if (num > 0){

            System.out.println(num + " --> poziftir.");



        }
        if (num < 0){

            System.out.println(num + " --> negatiftir.");

        }

        System.out.println("----------");

        int n = 5;

        if (n > -1 && n < 10){

            System.out.println("Rakam");

        }

    }

}