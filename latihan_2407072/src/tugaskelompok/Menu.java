

class Menu {
    private String nama;
    private int harga;

    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public Menu(String nama) {
        this.nama = nama;
        this.harga = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setHarga(int harga, int diskon) {
        this.harga = harga - diskon;
    }

    public void detailMenu() {
        System.out.println("Menu: " + nama + " | Harga: " + harga);
    }
}