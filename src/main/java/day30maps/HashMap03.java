package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {

    public static void main(String[] args) {

        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        // String i tum noktalama isaretlerinden temizledik
        String s = "I like you, like like!";
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s); // I like you like like

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words)); // [I, like, you, like, like]

        // "words" array indeki kelimeler birer birer Map de varmi yokmu diye kontrol edicez
        // "words" array indeki kelimeler Map de yoksa Map e value su 1 olarak koy diycez
        // "words" array indeki kelimeler Map de varsa Map e varolan value u 1 artirarak ekle diyecegiz
        HashMap<String, Integer> occ = new HashMap<>();

        for (String w : words) {

            Integer numOffOccurance =  occ.get(w);

            if (numOffOccurance == null) {

                occ.put(w,1);

            } else {

                occ.replace(w, numOffOccurance + 1);

            }

        }

        System.out.println(occ);

        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    }

}