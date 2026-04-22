package latihan;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: Rp " + hitungTotal());
    }
}