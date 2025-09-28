public class Day21 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Sebelum swap: a = " + a + ", b = " + b);

        a = a + b; // a sekarang 15
        b = a - b; // b sekarang 5
        a = a - b; // a sekarang 10

        System.out.println("Sesudah swap: a = " + a + ", b = " + b);
    }
}
