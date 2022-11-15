package task14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {
    private static final Pattern DATE_PATTERN = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$");

    public static void main(String[] args) {
        System.out.println(checkString("29/02/2000"));
        System.out.println(checkString("29/02/2001"));
        System.out.println(checkString("30/04/2003"));
        System.out.println(checkString("01/01/2003"));
        System.out.println(checkString("03-04-2003"));
        System.out.println(checkString("30-04-2003"));
        System.out.println(checkString("3-4-2003"));
        System.out.println(checkString("03-04-2003"));
        System.out.println(checkString("1/1/1899"));
    }

    private static boolean checkString(final String dateAsString) {
        Matcher m = DATE_PATTERN.matcher(dateAsString);
        boolean result = m.matches();
        if (result) {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if (day > 31) {
                return false;
            } else if (day == 31) {
                return (month % 2 == 1);
            } else if (day > 28 && month == 2) {
                return year % 4 == 0 && day == 29;
            }
        }
        return result;
    }
}
