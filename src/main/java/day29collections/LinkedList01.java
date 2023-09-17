package day29collections;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");

        /*
        System.out.println(s);

        s.remove(3); // 3. index i siler.

        System.out.println(s);

        s.remove(); // Ilk index i siler.

        System.out.println(s);

        s.remove("Orhan");

        System.out.println(s);

        s.removeFirstOccurrence("Nuriye"); // List deki String in ilk gorunumunu siler.

        s.removeLastOccurrence("Nuriye"); // List deki String in son gorunumunu siler.




         */

        String r1 = s.peek(); // Ilk node u silmeden verir. (copy + paste)

        System.out.println(r1); // Nuriye
        System.out.println(s); // [Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        String r2 = s.poll(); // Ilk node u silip verir. (cut + paste)

        System.out.println(r2); // Nuriye
        System.out.println(s); // [Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]


        /*
        peek() method u ile element() method u ikiside size ilk elemani silmeden verir ama peek() list bos oldugunda
        size null verir, element() ise hata verir.
        */

        String r3 = s.element();

        System.out.println(r3); // Orhan
        System.out.println(s); // [Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        poll() method u ile pop() method u ikiside size ilk elemani silip verir ama poll() list bos oldugunda
        size null verir, pop() ise hata verir.
        */

        String r4 = s.pop();

        System.out.println(r4); // Orhan
        System.out.println(s); // [Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

    }
}