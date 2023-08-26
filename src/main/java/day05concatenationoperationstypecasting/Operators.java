package day05concatenationoperationstypecasting;

public class Operators {

    /*
    1) +, -, *, / islemleri java'da matematikte kullanildigi gibi kullanilir.
    Note 1 : int / int = int olur
    Note 2 : double + int = double olur
    Cunku ; java'da matematiksel islemlerde farkli data typlari kullanilirsa sonuc her zaman büyük data type olur.

    2) Java'da "Logical Operator" lar vardir. AND ve OR islemleri logical operator lardir.
        i) AND (&&) isleminde true olabilmesi icin hersey true olmalidir.
           AND islemi "perfectionist" tir.
           AND isleminde bir tan false sonucu false yapar.

        ii) OR isleminde (||) bir tane true sonucu true yapmaya yeter.
            OR isleminde sonucun false olmasi icin hersey false olmalidir.
            OR islemi "polyana" gibidir.

        iii) NOT operator (!) true olani false, false olani true yapar.
             !true = false
             !false = true
             !!true = true

    3) Comparison (Karsilastirma) Operators
        <, >, <=, >=, ==, !=
        Note : Karsilastirma operatorlarini kullandiginde kesinlikle boolean (true ya da false) alirsiniz.

        Note : Biz AND islemi icin && kullaniriz ama & kullanimida gecerlidir.
        Farki nedir?
        && kullanim ilk ifade false oldugunda digerini kontrol etmez dolayisiyla hizli calisir.
        Cunku and isleminde ilk ifade false ise diger degerlerin ne oldugunun bir onemi yoktur sonuc false olur.
        & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayisiyla yavas calisir.
        bu yuzden biz hep && kullaniriz.
     */

    public static void main(String[] args) {

        boolean first = 3 < 5;

        System.out.println("3 < 5 ==> " + first);

        boolean second = 2 + 3 != 5;

        System.out.println("2 + 3 != 5 ==> " + second);

        boolean third = 2 + 3 * 5 >= 19;

        System.out.println("2 + 3 * 5 >= 19 ==> " + third);

        System.out.println("first && second = " + (first && second));

        System.out.println("first || second || third = " + (first || second || third));

    }

}