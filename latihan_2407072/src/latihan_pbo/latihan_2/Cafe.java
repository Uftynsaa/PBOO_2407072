package latihan_pbo.latihan_2;

import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode menu (2/3/4): ");
        int pilihan = input.nextInt();  // 1 parameter perbandingan

        if (pilihan == 2) {
            System.out.println("Nama : Kopi Susu");
            System.out.println("Takaran Kopi : 2 sendok");
            System.out.println("Takaran Susu : 3 sendok");
        } 
        else if (pilihan == 3) {
            System.out.println("Nama : Mocca");
            System.out.println("Espresso : 1 shot");
            System.out.println("Susu : 2 shot");
            System.out.println("Foam : 1/2 shot");
        } 
        else if (pilihan == 4) {
            System.out.println("Nama : Cappuccino");
            System.out.println("Espresso : 1 shot");
            System.out.println("Susu : 1 shot");
            System.out.println("Foam : 1 shot");
        } 
        else {
            System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
}