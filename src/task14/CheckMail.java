package task14;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMail {
    private static final Pattern MAIL_PATTERN = Pattern.compile(
            "^([^\\x00-\\x20\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\xff]+"
                    + "|\\x22([^\\x0d\\x22\\x5c\\x80-\\xff]|\\x5c[\\x00-\\x7f])*\\x22)(\\x2e([^\\x00-"
                    + "\\x20\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\xff]+|\\"
                    + "x22([^\\x0d\\x22\\x5c\\x80-\\xff]|\\x5c[\\x00-\\x7f])*\\x22))*\\x40([^\\x00-\\"
                    + "x20\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\xff]+|\\x5"
                    + "b([^\\x0d\\x5b-\\x5d\\x80-\\xff]|\\x5c[\\x00-\\x7f])*\\x5d)(\\x2e([^\\x00-\\x2"
                    + "0\\x22\\x28\\x29\\x2c\\x2e\\x3a-\\x3c\\x3e\\x40\\x5b-\\x5d\\x7f-\\xff]+|\\x5b("
                    + "[^\\x0d\\x5b-\\x5d\\x80-\\xff]|\\x5c[\\x00-\\x7f])*\\x5d))*$");

    public static boolean checkString(String string) {
        return MAIL_PATTERN.matcher(string).matches();
    }

    public static void main(String[] args) {
        System.out.println(checkString("user@example.com"));
        System.out.println(checkString("root@localhost"));
        System.out.println(checkString("myhost@@@com.ru"));
        System.out.println(checkString("@my.ru"));
        System.out.println(checkString("Julia String"));
    }
}
