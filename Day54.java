public class Day54 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Ketemu angka 3, skip dulu ya!");
                continue; // lewati iterasi saat i = 3
            }

            if (i == 5) {
                System.out.println("Ketemu angka 5, stop di sini!");
                break; // hentikan perulangan sepenuhnya
            }

            System.out.println("Angka: " + i);
        }
        System.out.println("Perulangan selesai.");
    }
}
