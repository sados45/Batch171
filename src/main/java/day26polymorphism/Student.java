package day26polymorphism;

public class Student {

    /*
    Encapsulation --> kapsulleme
    Encapsulation nedir? Data Hiding (Veri Saklama)
    Data nasil saklanir?
    Acces modifier larini private yaparak data yi diger class lardan gorunmez hale getiririm. Boylece datayi saklarim.
    Encapsulation yaptigimiz data yi istersek diger class lardan okuyabiliriz.
    getmethod olusturarak encapsule edilmis data nin degerini okuyabiliriz.
    1) get method lar public olur
    2) get method un return type i okudu variable in return type i ile ayni olur
    3) get method bir boolean variable icin olusturulduysa ismi "is" ile baslar
    */


    private String stdId = "AC202306014";
    public String stdName = "Ali Can";
    public int age = 13;
    private double noteAvg = 3.13;
    private boolean successful = false;

    public String getStdId() {

        return stdId;

    }

    public double getNoteAvg() {

        return noteAvg;

    }

    public boolean isSuccessful() {

        return successful;

    }
        /*
    Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz?
    "set method" olusturarak Encapsulate edilmis datanin degerini degistirebiliriz
    1) set methodlar hep public olur
    2) set methodlarin return typei hep void olur
    3) set methodlar parametre kullanir, parametrenin data typei variable ile ayni olur

    Note 1 : set method kullanarak varolan object uzerinde degisiklikler yaparak o object i sanki
    yeni bir object mis gibi kullanabiliriz.

    Note 2 : get metholarin diger adi getter, set method larin diger adi setter dir.
    getter ve setter larin ikisine birden" Java Beans" denir.
         */

    public void setStdId(String stdId) {

        this.stdId = stdId;

    }

    public void setNoteAvg(double noteAvg) {

        this.noteAvg = noteAvg;

    }

    public void setSuccessful(boolean successful) {

        this.successful = successful;

    }

}