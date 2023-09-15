package day24stringbuilder;

public class Sb03 {

    public static void main(String[] args) {

        /*
        1) StringBuffer Java'da String ureten bir diger clastir.
        StringBuffer java'nin String uretmek icin olusturdugu ilk class'dir

        2) StringBuffer, StringBuilder'a cok benzer, ikiside "mutable" String uretir
        3) StringBuffer "multi-thread" (Coklu is) dir. StringBuilder ise "multi-thread" degildir.
        4) StringBuilder multi-thread olmadigi icin StringBuffer'dan daha hizli calisir.
        5) "multi-thread" yapilirken yapilan islerin siralamasi önem arz eder, yapilan isleri mantikli bir siraya koymak "synchronization"
            olarak adlandirilir.
        StringBuffer "multi-thread" oldugundan ayni zamanda "synchronized" dir

        3 tane String olusturan class ogrendik;
        1) Immutable string lazimsa; String Class kullaniriz.
        2) Mutable String lazim ise StringBuilder veya StringBuffer kullaniriz
        a) StringBuffer multi-thread gerekirse kullaniriz
        b) StringBuilder multi-thread gerekmez ise kullaniriz
 */

        StringBuffer sbf = new StringBuffer("Java");

        System.out.println(sbf);
    }

}