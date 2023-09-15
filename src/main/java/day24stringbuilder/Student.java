package day24stringbuilder;

public class Student {

        /*
        Access Modifier
        1) public
        2) protected
        3) default (Access modifier i default yapmak istiyorsaniz basina access modifier yazmayiniz)
        4) private

        Note : Access Modifier lari genisten dara dogru siralayiniz
        public > protected > default > private

        public --> Her class tan herhangi bir kisitlama olmadan kullanilabilir.
        protected --> protected olan class lar baska package lardan kullanilamaz, ancak baska package a child class icinden kullanilabilir.
        default --> default olan class lar baska package lardan kullanilamazlar.
        private --> private olanlar sadece olusturulduklari class icinde kullanilabilirler.

        Note : "protected ile default un farkini soyleyiniz"
            protected olanlar baska package lardan kullanilamaz ancak baska package a child class icinden kullanilabilir.
         */

    public String stdName = "Ali Can";
    protected String address = "Istanbul";
    String email = "alican@gmail.com";
    private String ssnId = "36871254638";



}