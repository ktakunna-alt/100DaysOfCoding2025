import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Pesan Makanan");
        System.out.println("2. Pesan Minuman");
        System.out.println("3. Cek Total");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih menu Makanan");
                break;
            case 2:
                System.out.println("Kamu memilih menu Minuman");
                break;
            case 3:
                System.out.println("Kamu memilih Cek Total");
                break;
            case 4:
                System.out.println("Terima kasih sudah berkunjung");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
