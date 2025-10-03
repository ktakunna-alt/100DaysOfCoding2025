public class Day26 {
    public static void main(String[] args) {
        int x = 10;  // Operator penugasan '='
        System.out.println("Nilai awal x = " + x);

        x += 5;  // Sama dengan x = x + 5
        System.out.println("Setelah x += 5, x = " + x);

        x -= 3;  // Sama dengan x = x - 3
        System.out.println("Setelah x -= 3, x = " + x);

        x *= 2;  // Sama dengan x = x * 2
        System.out.println("Setelah x *= 2, x = " + x);

        x /= 4;  // Sama dengan x = x / 4
        System.out.println("Setelah x /= 4, x = " + x);

        x %= 3;  // Sama dengan x = x % 3
        System.out.println("Setelah x %= 3, x = " + x);
    }
}
