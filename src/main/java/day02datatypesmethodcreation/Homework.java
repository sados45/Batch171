package day02datatypesmethodcreation;

public class Homework {

    /*
      1) Dikdörtgenin alanini hesaplayan methodu olusturun ve kullaniniz.

      2) Dikdörtgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */

    public static void main(String[] args) {

        System.out.println("Area of Rectangle = " + areaOfRectangle(5,15));

        System.out.println("----------");

        System.out.println("Perimeter of Rectangle = " + perimeterOfRectangle(5, 15));

    }

    public static int areaOfRectangle (int a, int b)
    {

        return a*b;

    }

    public static int perimeterOfRectangle(int a, int b)
    {

        return 2*(a+b);

    }
}
