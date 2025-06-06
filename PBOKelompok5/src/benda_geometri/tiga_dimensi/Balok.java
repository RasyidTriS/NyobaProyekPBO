package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.PersegiPanjang;

// Balok adalah BentukTigaDimensi, jadi kita implementasikan kontraknya
public class Balok extends BentukTigaDimensi {
    
    // Balok "memiliki" alas persegi panjang, jadi kita gunakan komposisi.
    private PersegiPanjang alas;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Volume = Luas Alas * Tinggi
        return this.alas.hitungLuas() * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan = (2 * Luas Alas) + (Keliling Alas * Tinggi)
        double luasAlas = this.alas.hitungLuas();
        double kelilingAlas = this.alas.hitungKeliling();
        return (2 * luasAlas) + (kelilingAlas * this.tinggi);
    }
    
    public double getTinggi() {
        return this.tinggi;
    }
    
    public PersegiPanjang getAlas() {
        return this.alas;
    }
}