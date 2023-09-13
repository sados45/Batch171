package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
       1) Aynı data type indaki coklu datalari depolamak icin Array kuıllaniriz
       2) Array lerin bir negatif yonu var; icine koyacaginiz eleman sayisi en basta belirlemek zorundasiniz
       3) Array ler eleman sayisinda esnek degildirler. Bu yuzden Java "ArrayList" adli yeni bir yapi olusturuldu
       Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
       4) Arraylist yerine sadece List de diyebiliriz.
       5) Java Arraylistleri olusturduktan sonra Array leri iptal etmedi cunku;
            a) Array ler superfast tir.
            b) Array ler memory de cok az yer kaplarlar.
            c) Bu nedenle eleman sayisi belli olan data lari depolamak icin Array ler tercih edilir
       6) Array ler primitive daya type lari ve non-primitive lerin reference larini depolayabilir.
       ama Arraylistler "non-primitive" data typ lerini depolar. Bu yuzden Arraylist ler Array lerden daha fazla yer kaplar
         */

        // ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        // ArrayList console a nasil yazdirilir?
        System.out.println(ages);

        // Arraylistlere eleman nasil eklenir?
        // Arraylistlere eleman eklemek icin add() method u kullanilir
        // add() method elemanlari sizin verdiginiz sirada list e ekler.(Insert Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);

        System.out.println(ages);

        //List e coklu eleman nasil eklenir? ve ya List e baska bir list nasil eklenir?
        // Bir list e coklu eleman eklemek icin o elemanlari once bir list in icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        System.out.println(newAges);

        ages.addAll(newAges);

        System.out.println(ages);

        ages.addAll(2,newAges);

        System.out.println(ages);

        // ArrayList te eleman sayisi nasil bulunur?
        // size() method u bir list teki eleman sayisini verir.

        int numOfElements = ages.size();

        System.out.println(numOfElements);

        // ArrayListte specific bir eleman nasil alinir?
        // get() method u

        int element1 = ages.get(1);

        System.out.println(element1);

        // ArrayList te specific bir eleman nasil degistirilir?

        ages.set(6,111);
        ages.set(4,313);

        System.out.println(ages);

        // ArrayList teki tum elemanlari nasil silebilirim?

        ages.clear();

        System.out.println(ages);

        // ArrayList te specific bir elemanin var olup olmadigini nasil anlariz?

        boolean r1 = ages.contains(656);

        System.out.println(r1);

        // ArrayList in bos olup olmadigini nasil kontrol ederiz?

        boolean r2 = ages.isEmpty();

        System.out.println(r2);

        // Ornek 1 : Size verilen bir list in bos olup olmadigini kontrol ediniz.

        ArrayList<String> names = new ArrayList<>();

        names.add("Bunyamin");
        names.add("Emine");
        names.add("Ummu");
        names.add("Ali");

        // 1. Way

        if (names.size() == 0){

            System.out.println("List is empty");

        } else {

            System.out.println("List has at least 1 element");

        }

        names.clear();

        // 2. Way Recommended

        if (names.isEmpty()){

            System.out.println("List is empty");

        } else {

            System.out.println("List has at least 1 element");

        }

        /*
        Bir method ogrenirken 3 seyi ogrenin
        1) O method ne is yapar?
        2) O method nasil kullanilir?
        3) O method size neyi verir?
         */

    }

}