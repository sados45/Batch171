package day24stringbuilder;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");

        System.out.println(sb1);

        sb1.reverse(); // String in ters cevrilmesi looplar ile yapilir, bu kisa yoldur.

        System.out.println(sb1);

        sb1.deleteCharAt(6);

        System.out.println(sb1);

        sb1.delete(4,7); // Baslangic index dahil bitis index haric olmak uzrere verilen deger arasindaki karakterleri siler

        System.out.println(sb1);

        sb1.replace(2,5,"OOO");

        System.out.println(sb1);

        sb1.insert(3,"XXX");

        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Hava");

        // Sonuc 0 ise alfabetik olarak ayni siradadirlar demektir.
        // Sonuc -1 ise sb2, sb3 den alfabetik olarak onde demektir.
        // Sonuc 1 ise sb2, sb3 den alfabetik olarak geride demektir.

        int r1 = sb2.compareTo(sb3);

        System.out.println(r1);

        // StringBuilder nasil String e cevrilir?

        String str = sb2.toString().toUpperCase();

        System.out.println(str);

        StringBuilder newSb2 = new StringBuilder(str);

        System.out.println(newSb2);

    }

}