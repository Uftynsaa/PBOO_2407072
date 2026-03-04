package latihan_pbo.latihan_2.tugas;

import java.util.Scanner;

public class CafeBurger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "Burger Spesial";
        String bahan1 = "Roti";
        
        System.out.print("Masukkan jumlah daging: ");
        int daging = input.nextInt();   // bahan2
        
        System.out.print("Masukkan jumlah keju (2/3/4): ");
        int keju = input.nextInt();     // bahan3 (parameter perbandingan)

        System.out.println("\n=== Detail Menu ===");
        System.out.println("Nama Menu : " + nama);
        System.out.println("Bahan1 : " + bahan1);
        System.out.println("Bahan2 (Daging): " + daging);
        System.out.println("Bahan3 (Keju): " + keju);

        // SUATU KONDISI LEBIH KOMPLEKS
        if (keju >= 3 && daging >= 2) {
            System.out.println("Kondisi: Burger Premium 🍔");
        } else if (keju >= 2) {
            System.out.println("Kondisi: Burger Regular");
        } else {
            System.out.println("Kondisi: Burger Biasa");
        }

        input.close();
    }
}
