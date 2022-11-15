package task13;

public class FormatTelephoneNumber {
    private String number;

    public FormatTelephoneNumber(String number) {
        this.number = number;
        formatNumber();
    }

    private void formatNumber() {
        StringBuilder sb = new StringBuilder();
        if (this.number.startsWith("+7")) {
            sb.append("+7").append(number, 2, 5).append("-").append(number, 5, 8).append("-").append(number, 8, 12);
        } else if (this.number.startsWith("8")) {
            sb.append("+7").append(number, 1, 4).append("-").append(number, 4, 7).append("-").append(number, 7, 11);
        }
        this.number = sb.toString();
    }

    public String get() {
        return this.number;
    }

    public static void main(String[] args) {
        FormatTelephoneNumber ftm1 = new FormatTelephoneNumber("+79999881642");
        FormatTelephoneNumber ftm2 = new FormatTelephoneNumber("89999881642");
        System.out.println(ftm1.get());
        System.out.println(ftm2.get());
    }
}
