import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nSetelah ditukar:");
        System.out.println("Nilai pertama: " + a);
        System.out.println("Nilai kedua: " + b);

    }
}
