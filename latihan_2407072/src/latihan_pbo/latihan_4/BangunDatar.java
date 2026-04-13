package latihan_pbo.latihan_4;

public class BangunDatar {
    
    // atribut dibuat private agar menerapkan encapsulation
    private double varA;
    private double varB;

    // constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    public double getVarA() {
        return varA;
    }

    public void setVarA(double varA) {
        this.varA = varA;
    }

    public double getVarB() {
        return varB;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // method hitungLuas default 0
    public double hitungLuas() {
        return 0;
    }

    // method tampilkan
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("======================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("======================");
    }
}