package day28interfacecollections;

public class Accord implements Ac, Engine, Security {
    @Override
    public void cool() {

        System.out.println("Accords cool super!");

    }

    @Override
    public void run() {

        System.out.println("Engine run super");

    }
}