import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username, password;
        int percobaan = 0;
        boolean loginBerhasil = false;

        do {
            System.out.print("Masukkan Username : ");
            username = input.nextLine();

            System.out.print("Masukkan Password : ");
            password = input.nextLine();

            if (username.equalsIgnoreCase("Kristin") && password.equals("D0224329")) {
                System.out.println("\nLogin Sebagai Pengguna\n");
                loginBerhasil = true;

            } else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                System.out.println("\nLogin Sebagai Admin\n");
                loginBerhasil = true;

            } else {
                System.out.println("\nSilahkan coba lagi.\n");
                percobaan++;
            }

        } while (!loginBerhasil && percobaan < 3);

        if (!loginBerhasil) {
            System.out.println("Login Gagal.\n");
        }
    }
}
