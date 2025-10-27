public class Day50 {
    public static void main(String[] args) {
        // Membuat variabel bertipe data primitif
        int angka = 25;
        double nilai = 92.75;
        boolean status = true;
        char huruf = 'A';

        // Mengubah tipe data primitif menjadi String
        String strAngka = String.valueOf(angka);
        String strNilai = String.valueOf(nilai);
        String strStatus = String.valueOf(status);
        String strHuruf = String.valueOf(huruf);

        // Menampilkan hasil konversi
        System.out.println("Hasil konversi int ke String: " + strAngka);
        System.out.println("Hasil konversi double ke String: " + strNilai);
        System.out.println("Hasil konversi boolean ke String: " + strStatus);
        System.out.println("Hasil konversi char ke String: " + strHuruf);
    }
}
