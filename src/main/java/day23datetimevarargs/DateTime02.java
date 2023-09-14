package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime02 {

    public static void main(String[] args) {

        // Anlik zamani nasil aliriz?

        LocalTime myCurrentTime = LocalTime.now();

        System.out.println(myCurrentTime);

        int hour = myCurrentTime.getHour();
        int minute = myCurrentTime.getMinute();
        int second = myCurrentTime.getSecond();
        int nano = myCurrentTime.getNano();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);

        // Gelecek ve gecmise nasil gidilir?

        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);

        System.out.println(next);

        /*
         Zaman formati nasil degistirilir?
         DateTime class ta kullanilan tarih saat formatlari
         HH : mm --> 24 lu saat sistemi
         hh : mm --> 12 li saat sistemi
         hh : mm a --> 12 li saat sistemii A.M. - P.M. gösterilir
         HH : mm : ss --> 24 lu saat sistemi
         HH : MM --> yanlis format!
         "mm" minute, "MM" month demektir.

         dd-MM-yyyy --> gun - ay - yil
         MMM --> ayin ilk uc harfi
         MMMM --> ayin tam ismi
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyCurrentTime =  dtf1.format(myCurrentTime);

        System.out.println(formattedMyCurrentTime);

        // Date formati nasil degistirilir?

        LocalDate myDate = LocalDate.of(2023,8,13);

        System.out.println(myDate);


        // Tarihi AY/GUN/YIL sekline ceviriniz

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf2.format(myDate);

        System.out.println(formattedMyDate);

        // Tarih GUN/Ay isminin ilk 3 harfi/YIL sekline ceviriniz.

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyDate2 = dtf3.format(myDate);

        System.out.println(formattedMyDate2);

        // Tarih GUN/Ay ismi/YIL seklinde ceviriniz.

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyDate3 = dtf4.format(myDate);

        System.out.println(formattedMyDate3);

        // Baska bir zaman dilimindeki tarih ve zamani basil alabiliriz?

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?

        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));

        System.out.println(dateInAmsterdam);

        // Tokyo da saat kac?

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(timeInTokyo);

        // Amsterdam da saat kac?

        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));

        System.out.println(timeInAmsterdam);

        // Berlin de saat kac?

        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));

        System.out.println(timeInBerlin);


    }

}