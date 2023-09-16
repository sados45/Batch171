package day26polymorphism;

public class Animal {

    /*
    1) Parent Class daki method u child class icinde ozellestirerek kullanmaya overriding yapmak denir.
    2) Overriding de method signature a dokunulmaz (method signature = method ismi + parantez)
    3) private method lar override edilemez
    4) Child class daki method un acces modifier i parent class daki override edilmis(Overriden Method)un acces modifier
    dar olamaz. Aynisi olabilir ya da daha genis olabilir.
    5) Child class ta override edilen bir method un return type i ile parent daki method un return type i arasinda
    "IS A Relationship" varsa return type degistirilebilir.
    6) Method un return type i primitive ise Overriding yaparken return type degistirilemez. Cunkü return type ya ayni
    olur ve ya oarent tan secilir ama primitiveler arasinda Parent child iliskisi olmadigindan aynisi olmak zorundadir.
    7) Child da override edilen method un return type i ile parent taki method un return type i arasinda "IS A Relationship"
    yoksa return type DEGISTIRILEMEZ! Mesela;
    Integer wrapper class i ile Long wrapper class i arasinda "IS A Relationship" yoktur o yuzden degistirilemez.
    8) Method un return type i void ise Overriding yaparken return type degistirilemez.
    9) static method lar override edilemezler. Cunku static method lar tum child lar icin ortak method lardir. Bir child
    bir ortak method u degistirdiginde diger child lar bundan olumsuz etkilenebilir. Bu yüuden Java static method larin
    override edilmesine musade etmez.
    10) final method lar override edilemezler. final method larin body si degistirilemez ama override ederken method body
    degistiririz. Bu yuzden Java final method larin override edilmesine izin vermez.
        a) final keyword unu variable lar ile kullanabiliriz.
            i) Eger variable final ise mutlaka deger atanmalidir.
            ii) Ilk atanan deger degistirilemez.
        b) final keyword unu methodlar ile kullanabiliriz
            i) method final ise body si degistirilemez.
            ii) Degistirilemeyince override yapmak mumkun olmaz.
        c) fşnal keyword unu class lar ile kullanabiliriz.
            i) class final ise child i olamaz.

    Polymorphism = Method overloading + Method overriding
     */

    public void  eat() {

        // Parent daki override edilmis eat() method una Overriden Method denir

        System.out.println("Animals eat...");

    }

    public void drink() {

        System.out.println("Animals drink...");

    }

    public Animal create() {

        return new Animal();

    }

    public int add(int a, int b) {

        return a + b;

    }

    public Integer multiply(Integer a, Integer b) {

        return a * b;

    }

}