package latihan;

public class Main {
    public static void main(String[] args) {


        MenuItem item1 = new MenuItem("Nasi Goreng", 12000, 3);
        MenuItem item2 = new MenuItem("Es Teh", 5000, 2);
        MenuItem item3 = new MenuItem("Ayam Goreng", 20000, 1);
        MenuItem item4 = new MenuItem("Jus Jeruk", 8000, 2); 

        // Tampilkan semua
        item1.tampilkan();
        System.out.println("====================");
        item2.tampilkan();
        System.out.println("====================");
        item3.tampilkan();
        System.out.println("====================");
        item4.tampilkan();

        System.out.println("====================");

        // Hitung total bayar
        double totalBayar = 0;
        totalBayar += item1.hitungTotal();
        totalBayar += item2.hitungTotal();
        totalBayar += item3.hitungTotal(); 
        totalBayar += item4.hitungTotal(); 

        System.out.println("TOTAL BAYAR: Rp " + totalBayar);
    }
}