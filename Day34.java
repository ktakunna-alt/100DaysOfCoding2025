public class Day34 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = 5;

        // Mengkombinasikan operator aritmatika dan perbandingan
        boolean hasil1 = (a + b) > c;   // (8 + 3) > 5 → 11 > 5 → true
        boolean hasil2 = (a - c) < b;   // (8 - 5) < 3 → 3 < 3 → false

        // Mengkombinasikan operator logika
        boolean gabungan = hasil1 && hasil2;  // true && false → false

        System.out.println("Hasil1 = " + hasil1);
        System.out.println("Hasil2 = " + hasil2);
        System.out.println("Gabungan (hasil1 && hasil2) = " + gabungan);
    }
}
