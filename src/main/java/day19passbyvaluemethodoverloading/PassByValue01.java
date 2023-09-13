package day19passbyvaluemethodoverloading;

public class PassByValue01 {

    public static void main(String[] args) {

        // Note : Java "pass by value" sayeesinde value larin original degerlerini korur.
        int shirtPrice = 100;

        // java method a gonderirken orjinal degeri degil, kopyasini gonderir ve degisen deger kopya deger olur.
        System.out.println(discount("student", shirtPrice)); // 90
        System.out.println(discount("veteran", shirtPrice)); // 80
        System.out.println(discount("senior", shirtPrice)); // 95

        // Normalde indirim yaptik discount method u ile ama buradaki deger hala original
        System.out.println(shirtPrice); // 100

        shirtPrice = discount("veteran", shirtPrice);
        System.out.println("shirtprice kampanya " + shirtPrice);

    }
    // Discount methodunu olusturalim
    public static int discount(String type, int price){

        switch (type){
            case "student":

                price -= 10;
                break;

            case "veteran":

                price -= 20;
                break;

            case "senior":

                price -= 5;
                break;

            default:

                price = price;
        }

        return price;

    }

    /*
    Pass By Value:
    1) Java "pass by value" kullanir
    2) Yani java method larin original degeri degistirmesine musade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur veo o kopyayi method a yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece original deger korunmus olur.
    4) Java esnek bir dildir, istersek yazdigimiz kod ile original degerin degismesini de temin edebiliriz
        Bakiniz line 16

    Pass By Reference:
    1) Pass but Reference da method a reference yollanir.
    2) Reference adres demektir. Adress yollaninca method adresi kullanarak ariginal degere ulasir ve original degeri degistirir.
    Bu yuzden "C#" gibi Pass By Reference kullanan dillerde method variable in original degerini degistirir.
     */

}