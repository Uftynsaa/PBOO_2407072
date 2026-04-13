package latihan_pbo.latihan_4;

public class Main {
    public static void main(String[] args) {
        // menampilkan class induk
        BangunDatar bd = new BangunDatar(3, 4);
        bd.tampilkan();
        System.out.println();

        // gunakan satu tipe variabel yang sama: BangunDatar
        BangunDatar bangun;

        bangun = new Persegi(5);
        bangun.tampilkan();
        System.out.println();

        bangun = new PersegiPanjang(8, 4);
        bangun.tampilkan();
        System.out.println();

        bangun = new Segitiga(6, 10);
        bangun.tampilkan();
    }
}