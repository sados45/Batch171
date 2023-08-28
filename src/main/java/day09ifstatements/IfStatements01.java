package day09ifstatements;

public class IfStatements01 {

    public static void main(String[] args) {

        // Ornek 1 : Sati uc basamakli ise ekrana "Sayi uc basamaklidir"

        int number = 123;

        if (number > 99 && number < 1000){

            System.out.println(number + " uc basamaklidir!");

        }

        System.out.println("----------");

        number = Math.abs(number);

        if (number > 99 && number < 1000){

            System.out.println(number + " uc basamaklidir!");

        }

        System.out.println("----------");

        // Ornek 2 : Bir string deki tekrarsiz karakterleri ekrana yazdiriniz.

        String str = "abccbc";

        int aIndex = str.indexOf("a");
        int aLIndex = str.lastIndexOf("a");

        int bIndex = str.indexOf("b");
        int bLIndex = str.lastIndexOf("b");

        int cIndex = str.indexOf("c");
        int cLIndex = str.lastIndexOf("c");

        if (aIndex == aLIndex){

            System.out.println("a harfi 1 tanedir");

        }

        if (bIndex == bLIndex){

            System.out.println("b harfi 1 tanedir");

        }

        if (cIndex == cLIndex){

            System.out.println("c harfi 1 tanedir");

        }


    }

}