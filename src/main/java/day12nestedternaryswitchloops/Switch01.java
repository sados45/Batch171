package day12nestedternaryswitchloops;

public class Switch01 {
    public static void main(String[] args) {


        //NOTE: Javada kodlarimizi yazarken nested yapilardan mümkün oldugunca uzak durmaliyiz
        //cunku bu tarz yapilar uygulamayi yavaslatir. (Time Consuming)
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7


        //1.YOL: if else
        String dayName = "TUesday";

        if (dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);

        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);

        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);

        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);

        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);

        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);

        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);

        } else {
            System.out.println("Please enter a valid day");
        }


        //2.YOL: Switch (degistirmek)
        switch (dayName.toLowerCase()) {
            case "sunday" :
                System.out.println(1);

                break;

            case "monday" :
                System.out.println(2);

                break;

            case "tuesday" :
                System.out.println(3);

                break;

            case "wednesday" :
                System.out.println(4);

                break;

            case "thurday" :
                System.out.println(5);

                break;

            case "friday" :
                System.out.println(6);

                break;

            case "saturday" :
                System.out.println(7);

                break;  //break olmazsa bu veriyi de console yazdirir

            default:
                System.out.println("Please enter a valid day");
        }


    }
}