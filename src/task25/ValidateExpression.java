package task25;

public class ValidateExpression {
    public static void main(String[] args) {
        System.out.println(check("(3+5)–9×4"));
        System.out.println(check("((3+5)–9×4"));
    }

    private static boolean check(String s) {
        return 0 == s.chars()
                .mapToObj(Character::toString)
                .filter("()"::contains)
                .map("("::equals)
                .mapToInt(b -> b ? 1 : -1)
                .reduce(0, (x, y) -> (x >= 0 && x + y >= 0) ? x + y : -1);
    }
}