package day20statickeywordconstructors;

public class StdRunner {

    public static void main(String[] args) {

        // stdName static oldugu icim ona ulasmak icin object olusturmak zorunda degildir, class ismi kullanmak yeterlidir.
        System.out.println(Student.stdName);

        // age non-static oldugu icin ona ulasmak icin object olusturmak zorundayiz.
        Student std1 = new Student();

        System.out.println(std1.age);

        Student.staticMethod();

        std1.nonStaticMethod();
    }

}