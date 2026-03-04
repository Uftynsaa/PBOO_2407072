package Tugas.Tugas2_2407072;

import java.util.Scanner;

class Persegi {
    private double sisi;
    protected void setSisi(double s){ sisi = s; }
    public double hitungLuas(){ return sisi*sisi; }
    public double hitungKeliling(){ return 4*sisi; }
}

class PersegiPanjang {
    protected double panjang, lebar;
    public double hitungLuas(){ return panjang*lebar; }
    double hitungKeliling(){ return 2*(panjang+lebar); }
}

class Segitiga {
    private double alas, tinggi;
    protected void setData(double a,double t){ alas=a; tinggi=t; }
    public double hitungLuas(){ return 0.5*alas*tinggi; }
}

class Lingkaran {
    double jariJari;
    public double hitungLuas(){ return 3.14*jariJari*jariJari; }
    protected double hitungKeliling(){ return 2*3.14*jariJari; }
}

public class KalkulatorBangunDatar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1.Persegi\n2.Persegi Panjang\n3.Segitiga\n4.Lingkaran");
        System.out.print("Pilih (1-4): ");
        int pilih = input.nextInt();

        if(pilih==1){
            Persegi p=new Persegi();
            System.out.print("Masukkan sisi: ");
            p.setSisi(input.nextDouble());
            System.out.println("Luas: "+p.hitungLuas());
            System.out.println("Keliling: "+p.hitungKeliling());

        } else if(pilih==2){
            PersegiPanjang pp=new PersegiPanjang();
            System.out.print("Masukkan panjang: ");
            pp.panjang=input.nextDouble();
            System.out.print("Masukkan lebar: ");
            pp.lebar=input.nextDouble();
            System.out.println("Luas: "+pp.hitungLuas());
            System.out.println("Keliling: "+pp.hitungKeliling());

        } else if(pilih==3){
            Segitiga sg=new Segitiga();
            System.out.print("Masukkan alas: ");
            double a=input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t=input.nextDouble();
            sg.setData(a,t);
            System.out.println("Luas: "+sg.hitungLuas());

        } else if(pilih==4){
            Lingkaran l=new Lingkaran();
            System.out.print("Masukkan jari-jari: ");
            l.jariJari=input.nextDouble();
            System.out.println("Luas: "+l.hitungLuas());
            System.out.println("Keliling: "+l.hitungKeliling());

        } else System.out.println("Pilihan tidak tersedia!");

        input.close();
    }
}