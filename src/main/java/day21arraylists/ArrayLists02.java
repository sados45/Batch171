package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        // Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        // Ikı List in esit olabilmesi icin ayni index te ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();

        names1.add("Tom");
        names1.add("Jerry");
        names1.add("Silvester");

        ArrayList<String> names2 = new ArrayList<>();

        names2.add("Tom");
        names2.add("Silvester");
        names2.add("Jerry");
        boolean isItEqual = names1.equals(names2);

        System.out.println(isItEqual);

        // Size verilen 2 Integer List te tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        Collections.sort(nums1); // Listler icin method kullanacaginde Collections kullan
        boolean isItEqual2 = nums1.equals(nums2);

        System.out.println(isItEqual2);

        // ArrayList te bir elemanin ilk gorunumu nasil silinir?

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");

        System.out.println(cities);

        // remove() method u bir elemanin ilk gorunumunu siler

        System.out.println(cities.remove("Miami"));
        System.out.println(cities);

        // ArrayList te bir eleman index kullanilarak nasil silinir?

        System.out.println(cities.remove(2));
        System.out.println(cities);

        // remove() method u index ile kullanilirsa size silmis oldugu data yi return eder.
        // remove() method u eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder.

        // ArrayList olustururken sag tarafa (Constructor) ArrayList yazmak zorundayiz.
        // Ama sol tarafa ister ArrayList yazin ister List yazin ikiside calisir.
        // Detaylari Collections dersinde gorecegiz.

        // Ornek : Bir Integer List olusturun ve 12 elemanini List den siliniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //1 . yol
//        Integer nonPrimitive =12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2. yol

        ages.remove((Integer) 12);

        System.out.println(ages);

        //3. yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        //4. yol
        //ages.remove(ages.indexOf(12));
        //System.out.println(ages);

        // Bir ArrayList deki bir elemanin tum gorunumlerini nasil sileriz.

        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");

        cities.removeAll(citiesToRemove);

        System.out.println(cities);

    }

}