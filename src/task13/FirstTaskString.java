package task13;

public class FirstTaskString {
    public static void processString(String string) {
        System.out.println("Last character of string: " + string.indexOf(string.length() - 1));
        System.out.println((string.endsWith("!!!") ? "string ends with \"!!!\"" : "string doesn't ends with \"!!!\""));
        System.out.println((string.startsWith("I like") ? "string starts with \"I like\"" : "string doesn't starts with \"I like\""));
        System.out.println((string.contains("Java") ? "string contains with \"Java\"" : "string doesn't contains with \"Java\""));
        System.out.println("Index of substring \"Java\" is: " + string.indexOf("Java"));
        System.out.println("Replacing \"a\" to \"o\" string: " + string.replace('a', 'o'));
        System.out.println("Uppercase: " + string.toUpperCase());
        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("Substring without Java: "
                + string.substring(0, string.indexOf("Java"))
                + string.substring(string.indexOf("Java") + 4));
    }

    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}
