package task14;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class TakePrices {
    private static final Pattern PRICE_PATTERN = Pattern.compile("(\\d+\\.\\d{2} (USD|EU|RUB))");

    public static boolean check(String string) {
        return PRICE_PATTERN.matcher(string).matches();
    }

    public static void main(String[] args) {
        String[] prices = new String[]{"25.98 USD","2.08 RUB","5.98 UE","25.90 USD", "44 ERR", "0.004 EU"};
        ArrayList<String> result = new ArrayList<>();
        for (var price : prices) {
            if (check(price)) {
                result.add(price);
            }
        }
        System.out.println(result);
    }
}
