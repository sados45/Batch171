package day28interfacecollections;

public class Civic implements Ac, Engine, Security {
    @Override
    public void cool() {

        System.out.println("Civic cool perfect!");

    }

    @Override
    public void run() {

        System.out.println("AC runs super");

    }


    // Interface

}