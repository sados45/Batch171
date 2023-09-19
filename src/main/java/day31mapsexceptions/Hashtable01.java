package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {

    /*
    Hashtable ve HashMap arasindaki fark nedir?
        1) HashMap thread-safe ve synchronized degildir. Hastable thread-safe ve synchronized dir
        2) HashMap bir tane null key e ve istedigimiz kadar null value a musade eder
           Hashtable key lerde ve table larda null kullanilmasina musade etmez
        3) HashMap hizlidir, Hashtable HashMap lere gore yavastir

        Note : HashMap ve Hastable ikisi de entry leri rastgele siralar.
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa", 41);
        stdAges.put("Seda", 30);
        stdAges.put("Ekim", 22);
        stdAges.put("Ali Can", 18);
        // stdAges.put(null, 15);
        // stdAges.put(""mehmet", null);
        System.out.println(stdAges); // {Ekim=22, Ali Can=18, Mustafa=41, Seda=30}

    }

}