import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan hobi: ");
        String hobi = input.nextLine();

        // Output data
        System.out.println("\n=== BIODATA SEDERHANA ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi   : " + hobi);

        input.close();
    }
}
