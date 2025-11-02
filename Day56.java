import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int percobaan = 0;
        boolean loginBerhasil = false;

        do {
            System.out.print("Masukkan Username: ");
            username = input.nextLine();

            System.out.print("Masukkan Password: ");
            password = input.nextLine();

            if (username.equalsIgnoreCase("Auliyah") && password.equals("111")) {
                System.out.println("Login Sebagai Pengguna");
                loginBerhasil = true;
            } else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                System.out.println("Login Sebagai Admin");
                loginBerhasil = true;
            } else {
                System.out.println("Silahkan Coba Lagi");
                percobaan++;
            }

            if (percobaan == 3 && !loginBerhasil) {
                System.out.println("Login Gagal");
            }

        } while (!loginBerhasil && percobaan < 3);

    }
}
