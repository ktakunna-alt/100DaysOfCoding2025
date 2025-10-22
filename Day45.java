import java.util.Scanner;

public class KasusDetektifSelesai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Penanganan Kasus ===");
        System.out.println("1. Kasus pencurian");
        System.out.println("2. Kasus penipuan");
        System.out.println("3. Kasus pembobolan data");
        System.out.print("Masukkan nomor kasus yang sudah ditangani: ");
        int kasus = input.nextInt();

        switch (kasus) {
            case 1:
                System.out.println("Kasus pencurian: pelaku sudah ditangkap, kasus dinyatakan selesai.");
                break;
            case 2:
                System.out.println("Kasus penipuan: tersangka sudah mengaku, penyelidikan dihentikan.");
                break;
            case 3:
                System.out.println("Kasus pembobolan data: pelaku tertangkap oleh unit cybercrime, kasus selesai.");
                break;
            default:
                System.out.println("Kasus tidak ditemukan dalam daftar penyelidikan.");
                break;
        }
    }
}
