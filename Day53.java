public class Day53 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            if (i == 5) {
                System.out.println("Perulangan dihentikan di angka " + i);
                break;
            }

            System.out.println("Angka: " + i);
            i++;
        }

        System.out.println("Program selesai.");
    }
}
