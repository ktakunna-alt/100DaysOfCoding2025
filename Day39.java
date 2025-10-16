import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Kamu memilih Nasi Goreng");
        }
        if (pilihan == 2) {
            System.out.println("Kamu memilih Mie Goreng");
        }
        if (pilihan == 3) {
            System.out.println("Kamu memilih Sate Ayam");
        }
        if (pilihan == 4) {
            System.out.println("Terima kasih! Program selesai");
        }
        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid");
        }
    }
}
