import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian teori: ");
        int teori = input.nextInt();

        System.out.print("Masukkan nilai ujian praktik: ");
        int praktik = input.nextInt();

        boolean lulus = (teori >= 70) && (praktik >= 70);

        System.out.println("Lulus: " + lulus);

        input.close();
    }
}
