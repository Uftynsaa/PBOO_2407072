package latihan_pbo.latihan_4;

public class persegi extends BangunDatar {
    public double hitungLuas(){
        return getSisi() * getSisi();
    }

    public double hitungKeliling(){
        return 4 * getSisi();
    }
    
}
