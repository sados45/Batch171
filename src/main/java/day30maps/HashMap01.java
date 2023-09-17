package day30maps;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        /*
        1) Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsizdir, value kismi tekrarli olabilir
        3) Map lerdeki her bir elemana Entry denir, tamamına ise Entry Set denir
        4) Entry ler tekrarsiz oldugu icin Entry set denir
        5) Key ve value lar ayri ayri data type larinda olabilirler
        6) Map ler Collection degildir, farkli bir yapidir
        7) HashMap ler value leri rastgele siralar dolayisiyla en hızlı HashMap dir.
         */

        // Map nasil olusturulur?
        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Holland", 18000000);

        System.out.println(countryPopulation); // {USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000, Holland=18000000}

        // get() method u "key" ile calisir ve value kismini verir
        int usaPopilation = countryPopulation.get("Turkey");
        System.out.println(usaPopilation); // 83000000

        // Butun "key" leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet(); // [USA, Turkey, Germany, Albania, Holland]
        System.out.println(keys); // [USA, Turkey, Germany, Albania, Holland]

        // Butun value leri nasil alabiliriz?
        Collection<Integer> value = countryPopulation.values();
        System.out.println(value); // [400000000, 83000000, 83000000, 3000000, 18000000]

        // Ornek 1 : CountryPopulation map indeki ulkelerin nufuslarinin ortalamasi nedir?

        int totalAddition = 0;
        int total = countryPopulation.values().size();
        for (int w : countryPopulation.values()) {

            totalAddition += w;

        }

        totalAddition /= total;
        System.out.println(totalAddition); // 117400000

        // entrySet() method u map teki entry leri kalip halinde alip bize Set in icine koyarak verir
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        // Ornek 2 : countryPopulation Map indeki ulkelerin isimlerinin character sayisi ile nufuslarin toplamini bulunuz

        int toplam = 0;
        for (Map.Entry<String, Integer> w : entries) {

            toplam = toplam + w.getKey().length() + w.getValue();

        }

        System.out.println(toplam);

    }

}