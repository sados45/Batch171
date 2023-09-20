package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception{

    public InvalidStudentGradeException(String message) {
        super(message);
    }

    /*
    1) Custom Exception Class olusturmak icin Exception Class a extend etmeliyiz
       Exception Class a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
       Eger Runtime Exception uretmek istersek o zaman da RuntimeException Class a extend etmeliyiz

    2) Custom Exception Class olustururken constructor olusturmaliyiz ve bu constructor parent taki constructor u cagirmalidir
       Bu constructor mesaj verecek ve ya vermeyecek sekilde olusturulabilir

    3) Custom Exception Class olusturdugunuzda ismin sonunda Exception kelimesini kullanmalisiniz
     */

}