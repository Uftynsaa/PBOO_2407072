package Tugas1_2407072;

import java.util.Scanner;

public class LevelKekuatanKopi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Level Kekuatan Kopi ===");
        System.out.print("Masukkan jumlah takaran kopi (sendok): ");
        int kopi = input.nextInt();

        if (kopi >= 4) {
            System.out.println("Level Kopi: STRONG ");
        } else if (kopi >= 2) {
            System.out.println("Level Kopi: MEDIUM ");
        } else if (kopi == 1) {
            System.out.println("Level Kopi: LIGHT ");
        } else {
            System.out.println("Input tidak valid!");
        }

        input.close();
    }
}
