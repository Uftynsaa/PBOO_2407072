package latihan_pbo.latihan_2;

//ENCAPSULATION
//ACCESS MODIFIER (PUBLIC, PRIVATE, PROTECTED)

class PersegiPanjang {
    private int panjang;
    private int lebar;

    void tampil(){
        
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
     int hitungLuas(){
        return panjang * lebar;
    }   
    int hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}

public class Main {
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();    
        p.setPanjang(5);
        p.setLebar(3);  
        System.out.println("panjang= " + p.getPanjang());
        System.out.println("lebar= " + p.getLebar());   
        System.out.println("Luas= " + p.hitungLuas());
        System.out.println("Keliling= " + p.hitungKeliling());
        

    }
}
    

