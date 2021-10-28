import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();

        System.out.println(validateSNILS(str));

    }

    // validate address
    public static boolean validateAddress( String address ) {
        return address.matches("^[А-я]{1,30}\\s[А-я]{1,30}\\s[А-я]{1,30},\\sул.\\s[А-я]{1,30}," +
                "\\sд.\\s\\d{1,3},"+
                "\\sкв.\\s\\d{1,3},"+
                "\\sг.\\s[А-я]{1,30}," +
                "\\s[А-я]{1,30},"+
                "\\s\\d{6}$");
    }
    // validate SNILS
    public  static  boolean validateSNILS(String snils){
        return snils.matches("^\\d{3}-\\d{3}-\\d{3}\\s\\d{2}$");
    }

    // validate FIO
    public static boolean validateFIO( String fio ) {
        return fio.matches("^[А-я]{1,30}\\s[А-я]{1,30}\\s[А-я]{1,30}," +
                "\\s\\d{2}.\\d{2}.\\d{4}," +
                "\\s[А-я]{1,30},"+
                "\\s[А-я]{1,30}$");
    }

    public static boolean validateBookOutput(String output){
        return output.matches("^автор\\s[А-я ]{1,50}," +
                "\\s[А-я ]{1,50}," +
                "\\sООО Издательство\\s[А-я ]{1,50}," +
                "\\sгод издания\\s\\d{4}," +
                "\\sколичество страниц\\s\\d{3}$");
    }

    public static boolean validateArticle(String article){
        return article.matches("^автор\\s[А-я ]{1,50}," +
                "\\s[А-я ]{1,50}," +
                "\\sжурнал\\s[А-я ]{1,50}," +
                "\\sномер\\s\\d{3}," +
                "\\sколичество страниц\\s\\d{3}$");
    }
}
