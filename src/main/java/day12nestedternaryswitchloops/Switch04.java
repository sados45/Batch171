package day12nestedternaryswitchloops;
import java.util.Locale;
import java.util.Scanner;
public class Switch04 {
    public static void main(String[] args) {
          /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a country name: ");
        String countryName = scanner.nextLine();

        String abbreviation;

        switch (countryName.toLowerCase()) {
            case "america":
                abbreviation = "US";
                break;
            case "england":
                abbreviation = "UK";
                break;
            case "germany":
                abbreviation = "DE";
                break;
            case "turkey":
                abbreviation = "TR";
                break;
            case "india":
                abbreviation = "IN";
                break;
            case "peru":
                abbreviation = "PE";
                break;
            case "spain":
                abbreviation = "ES";
                break;
            case "Bulgaria":
                abbreviation = "BG";
                break;
            case "Albania":
                abbreviation = "AL";
                break;
            case "France":
                abbreviation = "FR";
                break;
            default:
                abbreviation = "Invalid country name.";
        }

        System.out.println(abbreviation);


    }
}
