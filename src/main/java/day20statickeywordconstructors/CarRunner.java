package day20statickeywordconstructors;

public class CarRunner {

    public static void main(String[] args) {

        //Siz kendi constructor unuzu olusturdugunuzda java default constructor u siler.
        Car c1 = new Car("BMW", "M8", 2023, false);
        Car c2 = new Car("Ford", "Mustang", 2020, false );
        Car c3 = new Car("Chevrolet", "CamaroSS", 2022, false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car c4 = new Car("Mercedes", "AMG GT4");
    }

}