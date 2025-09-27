public class Day20 {
    public static void main(String[] args) {
        int angka = 537;
        double pecahan = 41.23;
        boolean status = false;

        // Cara 1: String.valueOf()
        String s1 = String.valueOf(angka);

        // Cara 2: + ""
        String s2 = pecahan + "";

        // Cara 3: toString()
        String s3 = Boolean.toString(status);

        System.out.println("Integer -> String: " + s1);
        System.out.println("Double  -> String: " + s2);
        System.out.println("Boolean -> String: " + s3);
    }
}
