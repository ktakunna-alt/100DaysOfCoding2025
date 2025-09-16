public class Day09 {
    public static void main(String[] args) {
        // Deklarasi dulu
        int umur;
        double tinggi;

        // Inisialisasi belakangan
        umur = 18;
        tinggi = 160.5;

        System.out.println("Umur awal: " + umur);
        System.out.println("Tinggi awal: " + tinggi);

        // Update variabel
        umur = 19;          // langsung assign nilai baru
        tinggi = tinggi + 1.5; // tambah tinggi 1.5

        System.out.println("Umur setelah update: " + umur);
        System.out.println("Tinggi setelah update: " + tinggi);
    }
}
/*output:
Umur awal: 18
Tinggi awal: 160.5
Umur setelah update: 19
Tinggi setelah update: 162.0
*/
