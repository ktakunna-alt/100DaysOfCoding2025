public class Day25 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x++); // post-increment (cetak dulu, baru tambah 1)
        System.out.println(++x); // pre-increment (tambah dulu, baru cetak)
        System.out.println(x--); // post-decrement
        System.out.println(--x); // pre-decrement
    }
}
