// Topik: Penggunaan Escape Sequence (\n, \t, dll)

public class day04 {
    public static void main(String[] args) {
        // \n digunakan untuk pindah baris
        System.out.println("Halo!\nSelamat datang di 100 Days of Coding.");

        // \t digunakan untuk memberi tab (spasi lebar)
        System.out.println("Java\tSeru\tBanget");

        // \" dan \' digunakan untuk menampilkan tanda kutip
        System.out.println("Nama: \"Kristin.\"");
        System.out.println("Nama: \'Kristin.\'");

        // \\ digunakan untuk menampilkan backslash karena satu \ dianggap escape sequence dijava.
        System.out.println("Folder tersimpan di C:\\Users\\Public");

        // \r digunakan untuk carriage return (mengulang dari awal baris). karakter sebelumnya ditimpa tanpa bikin baris baru.
        System.out.println("Belajar Java\rMantap!");// hasil: "Mantap! Java"

        // \b digunakan untuk backspace (menghapus karakter sebelumnya)
        System.out.println("Hello\b World");  // hasilnya "Hell World"
    }
}
