package day06swapvaluesstringmanipulations;

public class SwapValues {

    public static void main(String[] args) {

        // Swap : Yer degistirmek 1. kap Patates 2. kap Domates --> swap --> 1. kap Domates 2. kap Patates

        int a = 12;
        int b = 5; // Swap'den sonra --> a=5, b=12;
        int temp = 9;

        System.out.println("a = " + a); // 12

        System.out.println("b = " + b); // 5

        System.out.println("----------");

        // 1. Adim
        temp = a;

        // 2. Adim

        a = b;

        // 3. Adim

        b = temp;

        System.out.println("a = " + a); // 5

        System.out.println("b = " + b); // 12

        System.out.println("----------");

        // 2. Yol

        int elma = 12;
        int armut = 5;

        System.out.println("elma = " + elma); // 12

        System.out.println("armut = " + armut); // 5

        System.out.println("----------");

        elma = armut + elma; // 17 = 5 + 12

        armut = elma - armut; // 12 = 17 - 5

        elma = elma - armut; // 5 = 17 - 12

        System.out.println("elma = " + elma); // 5

        System.out.println("armut = " + armut); // 12

        System.out.println("----------");


    }

}
