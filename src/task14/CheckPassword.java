package task14;

import java.util.regex.Pattern;

public class CheckPassword {
    private static final Pattern MAIL_PATTERN = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])\\w{8,}$");

    public static boolean checkString(String string) {
        return MAIL_PATTERN.matcher(string).matches();
    }

    public static void main(String[] args) {
        System.out.println(checkString("F032_Password"));
        System.out.println(checkString("TrySpy11"));
        System.out.println(checkString("smart_pass"));
        System.out.println(checkString("A007"));
    }
}