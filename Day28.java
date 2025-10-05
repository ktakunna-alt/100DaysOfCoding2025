import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Apakah a sama dengan b? " + (a == b));
        System.out.println("Apakah a tidak sama dengan b? " + (a != b));
    }
}
