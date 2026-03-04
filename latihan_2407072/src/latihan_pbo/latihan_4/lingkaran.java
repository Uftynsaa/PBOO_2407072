package latihan_pbo.latihan_4;

public class lingkaran extends BangunDatar {
    public double jari(){
        return 3.14 * getJari() * getJari();
    }

    public double hitungKeliling(){
        return 2 * 3.14 * getJari();
    }

}
