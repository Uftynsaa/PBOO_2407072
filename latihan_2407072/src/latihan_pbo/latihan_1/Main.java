package latihan_pbo.latihan_1;

class Cafe {
    String nama;
    String alamat;

    // Constructor
    Cafe(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
    System.out.println("Nama Cafe adalah: " + nama); 
    System.out.println("Alamat Cafe adalah: " + alamat);
    System.out.println("=================================");
    }
    // Method
    void buka(){
        System.out.println("=================================");
        System.out.println("Cafe " + this.nama + " sedang buka.");
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
   
}
public class Main {
    public static void main(String[] args) {

         Cafe Cafe1 = new Cafe ("Kenangan Manis", "Kedungwungu");
         Cafe Cafe2 = new Cafe ("Kopi Janji Jiwa","Arahan");
         Cafe Cafe3 = new Cafe ("Kopi Kenangan","Sumber");
         Cafe Cafe4 = new Cafe ("Kopi Susu","Pekalongan");
         Cafe Cafe5 = new Cafe ("Kopi Tuku","tukdana");
         Cafe1.buka();
         Cafe1.setNama("Kenangan Manis");
         Cafe2.buka();
         Cafe2.setNama("Kopi Janji Jiwa");
         Cafe3.buka();
         Cafe3.setNama("Kopi Kenangan");
         Cafe4.buka();
         Cafe4.setNama("Kopi Susu");
         Cafe5.buka();
         Cafe5.setNama("Kopi Tuku");

        System.out.println("=================================");
    }

}