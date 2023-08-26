package day05concatenationoperationstypecasting;

public class AsciValues {

    public static void main(String[] args) {

        /*
        Java da her karakterin sayisal bir degeri vardir.
        Bu degerler ASCII degerler olarak adlandirilir.
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.
         */

        char a = 'a';

        System.out.println(a); //a

        int intA = 'a';

        // Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyariz.
        System.out.println(intA); //97

        int unlem = '!';

        System.out.println(unlem); //33

        char c1 = 'K';
        char c2 = '?';

        //Java da char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerilerini kullanir.
        System.out.println(c1 + c2); //138


    }

}