import java.util.Scanner;

public class Day13 {
  public static void main(String[] args {
    Scanner ab = new Scanner(System.in);
    System.out.print("Masukkan nilai A: ");
    int A = ab.nextInt();
    System.out.print("masukkan nilai B: ");
    int B = ab.nextInt();

    int C = A;
    A = B;
    B = C;
    System.out.println("nilai A = "+A);
    System.out.println("nilai B = "+B);
  }
}
