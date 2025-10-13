import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan level kamu: ");
        int level = input.nextInt();

        System.out.print("Apakah kamu punya Energy Core? (true/false): ");
        boolean punyaEnergyCore = input.nextBoolean();

        System.out.println("\n=== Status Akses Boss Battle ===");

        if (level >= 10) { 
            if (punyaEnergyCore) {
                System.out.println("🔥 Boss Battle Unlocked! Ayo bertarung, pahlawan!");
            } else {
                System.out.println("⚡ Level kamu cukup, tapi butuh Energy Core dulu!");
            }
        } else {
            System.out.println("❌ Level kamu belum cukup. Naikkan levelmu dulu!");
        }
    }
}
