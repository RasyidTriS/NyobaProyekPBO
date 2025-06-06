package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi;

public class Trapesium extends BentukDuaDimensi {
    private double alasAtas;
    private double alasBawah;
    private double sisiMiring;
    private double tinggi;

    public Trapesium(double alasAtas, double alasBawah, double sisiMiring, double tinggi) {   
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (this.alasAtas + this.alasBawah) * this.tinggi; 
    }

    @Override
    public double hitungKeliling() {
        // Asumsi dari kode asli: Ini adalah trapesium sama kaki.
        return this.alasAtas + this.alasBawah + (2 * this.sisiMiring);   
    }

    public double getAlasAtas() {
        return alasAtas;
    }

    public double getAlasBawah() {
        return alasBawah;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }
}