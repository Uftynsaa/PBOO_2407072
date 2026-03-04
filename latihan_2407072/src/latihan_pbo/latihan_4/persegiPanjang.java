package latihan_pbo.latihan_4;

public class persegiPanjang extends BangunDatar {

    public double hitungLuas(){
        return getPanjang()*getLebar();
    }

    public double hitungKeliling(){
        return 2*(getPanjang()+getLebar());
    }
    
}
