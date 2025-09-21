public class Day14 {
    public static void main(String[] args) {
        // String yang mau diubah
        String strInt = "100";
        String strDouble = "3.14";
        String strBoolean = "true";

        // Ubah ke tipe data primitif
        int angkaInt = Integer.parseInt(strInt);
        double angkaDouble = Double.parseDouble(strDouble);
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);

        // Output hasil konversi
        System.out.println("String \"" + strInt + "\" jadi int: " + angkaInt);
        System.out.println("String \"" + strDouble + "\" jadi double: " + angkaDouble);
        System.out.println("String \"" + strBoolean + "\" jadi boolean: " + nilaiBoolean);
    }
}
