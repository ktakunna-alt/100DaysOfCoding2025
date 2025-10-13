import java.util.Scanner;

public class perbaiki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian kamu (0–100): ");
        int nilai = input.nextInt();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Nilai kamu A. Sangat baik!");
        } else if (nilai >= 75 && nilai < 90) {
            System.out.println("Nilai kamu B. Baik.");
        } else if (nilai >= 60 && nilai < 75) {
            System.out.println("Nilai kamu C. Cukup.");
        } else if (nilai >= 45 && nilai < 60) {
            System.out.println("Nilai kamu D. Kurang.");
        } else if (nilai >= 0 && nilai < 45) {
            System.out.println("Nilai kamu E. Tidak lulus.");
        } else {
            System.out.println("Nilai tidak valid. Masukkan antara 0–100.");
        }
    }
}
