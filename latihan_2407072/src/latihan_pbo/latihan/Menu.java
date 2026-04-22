package latihan;

public class Menu {
    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Total: Rp " + hitungTotal());
    }
}