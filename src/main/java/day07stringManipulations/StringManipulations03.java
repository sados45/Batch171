package day07stringManipulations;

public class StringManipulations03 {

    public static void main(String[] args) {

        // Ornek 1 : Bir String in bas ve sonunda space karakteri varsa siliniz.
        // "     Alican     "  --> "Ali Can"

        String s = "     Ali Can     ";

        System.out.println("s = " + s);

        //trim() methodu bir string in bas ve sonundaki space karakterlerini siler, aradaki space lere dokunmaz
        String sTrimmed = s.trim();

        System.out.println("sTrimmed = " + sTrimmed);

        System.out.println("----------");

    /*
    Ornek 2 : Asagidaki fiyatlari verilen urunlerin toplam fiyatlarini bulunuz.
     String tv = "$456.99";     String laptop = "$875.99"; --> 456.99 + 875.99 = 1332.98
     */

        String tv = "$456.99";
        String laptop = "875.99";

        String tv2 = tv.replace("$","");

        System.out.println(tv2);

        String laptop2 = laptop.replace("$","");

        System.out.println(laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);

        System.out.println("totalPrice = " + totalPrice);

        System.out.println("----------");

        // Ornek 3 : Verilen bir ismin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        // "    Ali Can    " --> AC

        String name = "   ali cAN   ";

        char first = name.trim().toUpperCase().charAt(0);

        System.out.println("first = " + first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("last = " + last);

        System.out.println("" + first + last);


    }

}