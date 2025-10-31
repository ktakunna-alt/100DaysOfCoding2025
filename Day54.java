public class Day54 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Nilai 3 dilewati menggunakan continue");
                continue; // melewati iterasi saat i = 3
            }

            if (i == 5) {
                System.out.println("Nilai 5 ditemukan, perulangan dihentikan dengan break");
                break; // menghentikan perulangan
            }

            System.out.println("Nilai i: " + i);
        }
        System.out.println("Perulangan telah selesai.");
    }
}
