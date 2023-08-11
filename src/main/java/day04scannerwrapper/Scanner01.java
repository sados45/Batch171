package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdirin.


        //1. adim; Scanner Classtan bir Object olustur.
        Scanner input = new Scanner(System.in);

        //2.adim : Kullaniciya ne istedigimize dair mesaj veriniz.
        System.out.println("Ilk isimini giriniz :");

        //3. adim : Uygun methodu kullanarak kullanicinin  verdigi datayi memorye yerlestiriniz.
        String firstName = input.next();

        System.out.println("Soyadinizi giriniz : ");
        String lastName= input.next();

        System.out.println(firstName+" "+ lastName);

    }
}
