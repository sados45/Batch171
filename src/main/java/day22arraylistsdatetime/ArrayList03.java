package day22arraylistsdatetime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

    public static void main(String[] args) {

        /*
        Example 1: Kullanicinin girdigi harf List te var ise o harfi "Buldum!" a cevirin, yok ise o harfi List e ekleyin
         */

        List<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("H");
        myList.add("J");
        int counter = 0;
        int live = 3;

        Scanner input = new Scanner(System.in);
        do {

            if (counter == live) {

                System.out.println("Game Over!");
                break;

            }

            System.out.println("Please enter a letter");

            String letter = input.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)) {

                myList.set(myList.indexOf(letter), "I fount it");

            } else {

                myList.add(letter);

            }

            System.out.println(myList);

            counter++;

        }while (true);

    }

}