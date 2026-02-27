package latihan_pbo.latihan_2.tugas;

import java.util.Scanner;

public class CafeMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "Ayam Geprek";
        int ayam = 1;      // bahan1
        int nasi = 1;      // bahan2
        
        System.out.print("Masukkan jumlah cabai (bahan3): ");
        int cabai = input.nextInt();   // parameter perbandingan

        System.out.println("\n=== Detail Menu ===");
        System.out.println("Nama Menu : " + nama);
        System.out.println("Bahan1 (Ayam) : " + ayam);
        System.out.println("Bahan2 (Nasi) : " + nasi);
        System.out.println("Bahan3 (Cabai): " + cabai);

        if (cabai >= 5) {
            System.out.println("Level Rasa: Sangat Pedas");
        } else if (cabai >= 3) {
            System.out.println("Level Rasa: Pedas");
        } else if (cabai >= 1) {
            System.out.println("Level Rasa: Tidak Pedas");
        } else {
            System.out.println("Input tidak valid");
        }

        input.close();
    }
}
