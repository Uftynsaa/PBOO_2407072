package latihan_pbo.latihan_4;

public class segitiga  extends BangunDatar {
    public double hitungLuas(){
        return 0.5 * getAlas() * getTinggi();
    }

    public double hitungKeliling(){
        return getSisi() + getSisi() + getSisi();
    }
    
}
