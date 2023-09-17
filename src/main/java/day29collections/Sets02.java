package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {

    public static void main(String[] args) {

        // Ornek : Ogrenci email adreslerini natural order da siralanmis olarak depolayiniz.
        // 1. Way

        long t1 = System.nanoTime();

        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("e@gmail.com");
        emails.add("m@gmail.com");
        emails.add("p@gmail.com");
        emails.add("h@gmail.com");
        emails.add("y@gmail.com");
        emails.add("g@gmail.com");
        emails.add("v@gmail.com");
        emails.add("s@gmail.com");
        emails.add("b@gmail.com");

        System.out.println(emails);

        long t2 = System.nanoTime();

        // 2. Way

        HashSet<String> emailsHs = new HashSet<>();

        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("h@gmail.com");
        emailsHs.add("y@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("v@gmail.com");
        emailsHs.add("s@gmail.com");
        emailsHs.add("b@gmail.com");

        TreeSet<String> emailHsTs = new TreeSet<>(emailsHs);

        System.out.println(emailHsTs);

        long t3 = System.nanoTime();

        System.out.println("TreeSet Speed = " + (t2 - t1));
        System.out.println("HashSet Speed = " + (t3 - t2));
    }

}