package Tugas.TugasPBO;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangun = new BangunRuang(10, 5, 4);

        System.out.println("Luas = " + bangun.hitungLuas());
        System.out.println("Volume = " + bangun.hitungVolume());
    }
}