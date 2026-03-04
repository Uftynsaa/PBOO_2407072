package latihan_pbo.latihan_4;

public class Main {
    public static void main(String[] args) {
        persegi persegi = new persegi();
        persegi.setSisi(5);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        persegiPanjang pp = new persegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(5);
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());

        segitiga segitiga = new segitiga();
        segitiga.setAlas(10);
        segitiga.setTinggi(5);
        segitiga.setSisi(7);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());

        lingkaran lingkaran = new lingkaran();
        lingkaran.setJari(8);
        System.out.println("Luas Lingkaran: " + lingkaran.jari());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
    
}
