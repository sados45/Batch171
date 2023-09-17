package day30maps;

import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Suat", 36);
        stdAges.put("Yusuf", 33);
        stdAges.put("Serkant", 26);
        stdAges.put("Emin", 19);
        stdAges.put("Alparslan", 30);
        stdAges.put("Alparslan", 33);

        // key i tekrarli kullandigimizda hata vermez, en son verilen entry nin degerini kabul eder
        // Bu yontem value guncellemede kullanilabilir. Buna "overwrite" denir

        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=19}

        stdAges.replace("Alparslan", 19); // Deger guncellemek icin Best Practice
        System.out.println(stdAges); // {Suat=36, Yusuf=33, Alparslan=19, Serkant=26, Emin=19}

        stdAges.replace("Serkant", 26, 23); // 26 value si varsa 23 yap
        System.out.println(stdAges); // {Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19}

        stdAges.putIfAbsent("Ali", 30); // Map te Ali key olarak yoksa Ali key ini 30 value si ile ekler varsa eklemez
        System.out.println(stdAges); // {Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19, Ali=30}

        System.out.println(stdAges.get("Fatih")); // Aranan key varsa value si ni yazdirir, yoksa null yazdirir
        System.out.println(stdAges.getOrDefault("Fatih",0)); // Ustteki null yerine girdigimiz degeri verir

        System.out.println(stdAges.containsValue(313)); // Value lerin icinde 313 var mi kontrol eder
        System.out.println(stdAges.containsKey("Yusuf")); // Key lerin icinde Yusuf var mi kontrol eder

        stdAges.remove("Emin"); // method key kullanarak entry i silmeye yarar
        System.out.println(stdAges);

        stdAges.remove("Suat", 36); // Hem key hem value degeri eslesirse siler
        System.out.println(stdAges);

    }

}