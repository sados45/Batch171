package day05concatenationoperationstypecasting;

public class TypeCasting {

    /*
    Numeric primitive data type larin birbirine donusmesine "Type Casting" denir.
    Numeric (sayisal) data type lar byte - short - int - long - float - double
     */

    //Note 1 : Kucuk data typlerini buyuk data typelarina cevirmeyi java otomatik yapar.
    //Bu isleme "AutoWidening" (otomatik genisletme) denir.

    //Note 2 : Buyuk data typlarini kucu data typelarina cevirmek riskli bir istir. Java bu riskli isi otomatik olarak yapmaz.
    //Bu islemi kod yazanlardan bekler.
    //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir.

    public static void main(String[] args) {

        //byte data type ini int data type ina ceviriniz.

        byte age = 13;
        int ageInt = age; //AutoWidening

        //int data type ini short data type ina ceviriniz.

        int weight = 312;
        short weightShort = (short) weight; //Explicit Narrowing

        // İnt data type ini float data type ina ceviriniz.

        int number = 25;

        System.out.println(number); //25

        float floatNumber = number;

        System.out.println(floatNumber); //25.0

        // double data type ini short data type ina ceviriniz

        double no = 12.99;

        System.out.println(no); //12.99

        short noShort = (short) no;

        System.out.println(noShort); //12

        //Example

        short num = 260;

        System.out.println(num);

        byte numByte = (byte) num;

        System.out.println(numByte); // -128 - 0 - 127

        // Note : Donusum yaptiginiz sayi donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar.


    }
}