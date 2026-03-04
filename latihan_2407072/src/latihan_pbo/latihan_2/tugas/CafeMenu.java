package latihan_pbo.latihan_2.tugas;

import java.util.Scanner;

public class CafeMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "Nasi Goreng";
        String bahan1 = "Nasi";
        String bahan2 = "Telur";

        System.out.print("Masukkan level pedas (2/3/4): ");
        int bahan3 = input.nextInt();   // 1 parameter perbandingan

        System.out.println("\n=== Detail Menu ===");
        System.out.println("Nama Menu : " + nama);
        System.out.println("Bahan1 : " + bahan1);
        System.out.println("Bahan2 : " + bahan2);

        if (bahan3 == 2) {
            System.out.println("Bahan3 (Cabai): 2 sendok");
            System.out.println("Level: Sedang");
        } else if (bahan3 == 3) {
            System.out.println("Bahan3 (Cabai): 3 sendok");
            System.out.println("Level: Pedas");
        } else if (bahan3 == 4) {
            System.out.println("Bahan3 (Cabai): 4 sendok");
            System.out.println("Level: Sangat Pedas");
        } else {
            System.out.println("Level tidak tersedia");
        }

        input.close();
    }
}
