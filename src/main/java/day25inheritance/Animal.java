package day25inheritance;

public class Animal {

    /*
    Inheritance
    Ozellikleri bir class tan diger classlara alan bir kavramdir.
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturmus bir class sizin istediginiz ozelliklerin
    cougunu kapsiyor. O zaman yeni olusturdugumuz class i ozelliklerini kullanmak istediniz class a child yaparsiniz.

     Inheritance in faydalari
     1) Code tekrarlarindan kurtuluruz.
     2) Code tamiri (maintenance) kolay olur
     3) Child class lari daha atomik yapmıs oluruz.

     --> Bir class i baska bir class in child class i yapmak icin extends keyword u kullanilir. Ilk yazilan child,
         ikinci yazilan class parent olur. parent class a super class denir.

     --> Child class objectleri parent class dan method ve variable lari kullanabilirler.
     --> Parent class objectleri child classtan method ve variable lari kullanamazlar.
     --> javada bir class in sadece 1 parent i olabilir, coklu parent a "Multiple Inheritance" derler, tekli parent a
        "Single Inheritance" derler. Java "Multiple Inheritance" i desteklemez, "Java "single Inheritance"  kullanir.

     --> Apartman seklindeki inheritance yapisina "MultiLevel Inheritance" denir, java multilevel inheritance i destekler.

     --> Object class her class in parent i dir. Java da object class haric her class in parent i vardir.
         Java da parent i olmayan tek class object classdir.

     --> Java da parent dan child a olan iliskilere "HAS-A Relation Ship" denir.
     --> Java da child dan parent a olan iliskilere "IS-A Relation Ship" denir.

     --> Java da her class in bir tane default constructor u vardir. Bu default constructor class in icinde gorunmez
         Cunku default constructor "Object Class" icindedir.
     */

    public void eat() {

        System.out.println("Animals eat...");

    }

    public void drink() {

        System.out.println("Animals drink...");

    }



}