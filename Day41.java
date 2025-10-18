import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        System.out.print("Masukkan lama lembur (jam): ");
        int jamLembur = input.nextInt();

        int upahLembur = 55000;
        int totalGaji = gajiPokok + (jamLembur * upahLembur);

        System.out.println("Total gaji bersih Rina: Rp" + totalGaji);
    }
}
