public class Day44 {
    public static void main(String[] args) {
        
        int nilai = 78;
        
        char predikat; 
      
        if (nilai >= 85) {
            predikat = 'A';
        } else if (nilai >= 75) {
            predikat = 'B';
        } else if (nilai >= 65) {
            predikat = 'C';
        } else if (nilai >= 50) {
            predikat = 'D';
        } else {
            predikat = 'E';
        }

        
        System.out.println("Nilai: " + nilai);
        System.out.println("Predikat: " + predikat);
    }
}
