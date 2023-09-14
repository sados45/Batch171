package day23datetimevarargs;

public class Varargs01 {

    public static void main(String[] args) {

        /*
        Asagidaki gibi farkli methodlar olusturarak is yapamayiz
        Cunku kullanici farkli sayilari toplamak isteyebilir
        Her ihtimal icin bir method olusturmak mumkun degildir
        java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
        Bu yapiya Varargs denir.
        Varargs arkada Array yapisini kullanir
         */

        System.out.println(addition(1,2,3,4));

    }
    //Note 1) Bir method parantezinde birden fazla Varargs kullanilamaz
    //Note 2) Eger bir method parantezinde birden fazla parametre kullanilacaksa Varargs sonda olmalidir
    public static int addition(int... a) {

        int sum = 0;

        for (int w : a) {

            sum += w;

        }

        return sum;

    }

    // Toplama islemi yapan bir method olusturun.
/*
    public static int addition(int a, int b) {

        return a + b;
    }

    public static int addition(int a, int b, int c) {

        return a + b + c;
    }

    public static int addition(int a, int b, int c, int d) {

        return a + b + c + d;
    }
*/

}