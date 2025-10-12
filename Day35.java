import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian kamu: ");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai kamu A. Sangat baik!");
        } else if (nilai >= 75) {
            System.out.println("Nilai kamu B. Baik.");
        } else if (nilai >= 60) {
            System.out.println("Nilai kamu C. Cukup.");
        } else if (nilai >= 45) {
            System.out.println("Nilai kamu D. Kurang.");
        } else {
            System.out.println("Nilai kamu E. Tidak lulus.");
        }
    }
}
