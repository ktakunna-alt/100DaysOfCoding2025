import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
    }
}
