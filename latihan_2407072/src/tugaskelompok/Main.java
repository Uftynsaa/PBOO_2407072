import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("Cafe Kelompok");

        // Tambah menu
        cafe.tambahMenu(new Makanan("Nasi Goreng", 15000, "Berat"));
        cafe.tambahMenu(new Makanan("Mie Ayam", 12000, "Sedang"));
        cafe.tambahMenu(new Makanan("Batagor", 15000, "Ringan"));
        cafe.tambahMenu(new Makanan("Gado-Gado", 13000, "Ringan"));
        cafe.tambahMenu(new Minuman("Es Teh", 5000, "Medium"));
        cafe.tambahMenu(new Minuman("Kopi", 8000, "Small"));

        ArrayList<Menu> pesanan = new ArrayList<>();
        ArrayList<Integer> qtyList = new ArrayList<>();

        int total = 0;
        String lanjut;

        cafe.tampilkanMenu();

        do {
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            if (pilihan > 0 && pilihan <= cafe.jumlahMenu()) {
                Menu menuDipilih = cafe.getMenu(pilihan - 1);

                System.out.print("Jumlah (qty): ");
                int qty = input.nextInt();

                pesanan.add(menuDipilih);
                qtyList.add(qty);

                total += menuDipilih.getHarga() * qty;

                System.out.println("Ditambahkan: " + menuDipilih.getNama() + " x" + qty);
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Tambah lagi? (y/n): ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("y"));

        // HITUNG TOTAL ITEM
        int totalItem = 0;
        for (int i = 0; i < qtyList.size(); i++) {
            totalItem += qtyList.get(i);
        }

        // STRUK
        System.out.println("\n===== TOTAL PESANAN =====");

        for (int i = 0; i < pesanan.size(); i++) {
            Menu m = pesanan.get(i);
            int qty = qtyList.get(i);

            int subtotal = m.getHarga() * qty;

            System.out.println((i + 1) + ". " + m.getNama() +
                    " x" + qty +
                    " - " + subtotal);
        }

        System.out.println("--------------------------");
        System.out.println("Jumlah produk : " + pesanan.size());
        System.out.println("Jumlah item   : " + totalItem);
        System.out.println("Total harga   : " + total);
        System.out.println("Terima kasih!");

        input.close();
    }
}