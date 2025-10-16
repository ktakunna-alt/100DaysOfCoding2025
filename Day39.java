import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU APLIKASI MUSIK ===");
        System.out.println("1. Putar Lagu");
        System.out.println("2. Jeda Lagu");
        System.out.println("3. Ganti Lagu");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Lagu sedang diputar...");
        }
        if (pilihan == 2) {
            System.out.println("Lagu dijeda sementara.");
        }
        if (pilihan == 3) {
            System.out.println("Lagu diganti ke track berikutnya.");
        }
        if (pilihan == 4) {
            System.out.println("Keluar dari aplikasi musik. Sampai jumpa!");
        }
        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
}
