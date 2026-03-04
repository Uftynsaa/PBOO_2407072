package latihan_pbo.latihan_2.tugas;

import java.util.Scanner;

public class CafeJus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU JUS ===");
        System.out.println("2. Jus Mangga");
        System.out.println("3. Jus Alpukat");
        System.out.println("4. Jus Stroberi");
        System.out.print("Pilih menu (2/3/4): ");

        int pilihan = input.nextInt();

        if (pilihan == 2) {
            System.out.println("Nama Menu : Jus Mangga");
            System.out.println("Bahan:");
            System.out.println("- Mangga : 2 potong");
            System.out.println("- Air    : 3 gelas");
            System.out.println("- Gula   : 1 sendok");

        } else if (pilihan == 3) {
            System.out.println("Nama Menu : Jus Alpukat");
            System.out.println("Bahan:");
            System.out.println("- Alpukat : 3 potong");
            System.out.println("- Susu    : 2 sendok");
            System.out.println("- Gula    : 1 sendok");

        } else if (pilihan == 4) {
            System.out.println("Nama Menu : Jus Stroberi");
            System.out.println("Bahan:");
            System.out.println("- Stroberi : 4 potong");
            System.out.println("- Air      : 2 gelas");
            System.out.println("- Gula     : 2 sendok");

        } else {
            System.out.println("Menu tidak tersedia.");
        }

        input.close();
    }
}
