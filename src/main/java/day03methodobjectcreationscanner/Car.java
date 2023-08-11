package day03methodobjectcreationscanner;

public class Car {


    public String model = "Tesla";
    public int fiyat = 20000;

    //Methodlari olusturalim.
    //Note: "return type void oldugunda method icinde return keyword ü kullanilmaz.

    public void hareket (){

        System.out.println("Tesla cok hizli hareket eder.");
    }

    public void dur (){

        System.out.println("cok güvenli bir sekilde durur.");
    }
}
