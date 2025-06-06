package benda_geometri.dua_dimensi;

import benda_geometri.BentukDuaDimensi;

public class Segitiga extends BentukDuaDimensi {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {   
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi; 
    }

    @Override
    public double hitungKeliling() {
        // Asumsi dari kode asli: Ini adalah segitiga sama sisi
        // di mana panjang setiap sisinya sama dengan 'alas'.
        return 3 * this.alas;   
    }

    public double getSisi(){
        return alas;
    }
}