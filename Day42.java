import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gaji pokok: ");
        double gaji = input.nextDouble();

        System.out.print("Jam lembur: ");
        int lembur = input.nextInt();

        double gajiBersih = (gaji + lembur * 60000) * 0.90;

        System.out.println("Gaji bersih: Rp" + gajiBersih);

    }
}
