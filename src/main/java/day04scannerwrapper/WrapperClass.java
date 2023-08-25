package day04scannerwrapper;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive     :   char     -  boolean - byte - short - int     - long  - float - double
        //Wrapper Class :  Character -  Boolean - Byte - Short - Integer - Long  - Float - Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //o yuzden sart degilse  Wrapper class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz, cunku primitive ler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz, cunku wrapper classlar method icerir
        Integer m = 12;

        byte p = 13;
        Byte r = 13;

        //Ornek 1: short data type inin minimum ve maximum degerlerin kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768





        //Ornek 2 : int data type ini minimum degeri ile byte data type maximum degerlerinin toplamini bulunuz.

        int minInt = Integer.MIN_VALUE;

        byte maxByte = Byte.MAX_VALUE;

        int addition = minInt + maxByte;

        System.out.println("addition = " + addition);

        //Ornek 3 : Primitive int i wrapper Integer a ceviriniz.

        int num = 12;

        Integer wrapperNum = num; //Autoboxing

        //Ornek 4 : Wrapper byte i primitive byte a ceviriniz.

        Byte wrapperByte = 20;

        byte num2 = wrapperByte; //Unboxing

        //Ornek 5 : Primitive char i Wrapper Character e donusturunuz.

        char letter = 'a';

        Character wrapperLetter = letter;

        //Ornek 6 : Wrapper boolean i primitive boolean a ceviriniz.

        Boolean wrapperQuestion = false;

        boolean question = wrapperQuestion;

    }

    }
