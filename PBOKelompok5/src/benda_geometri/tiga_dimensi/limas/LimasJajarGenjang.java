package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.JajarGenjang;

public class LimasJajarGenjang extends BentukTigaDimensi {
    
    private JajarGenjang alas;
    private double tinggiLimas;

    public LimasJajarGenjang(double alasJajarGenjang, double tinggiAlas, double sisiA, double sisiB, double tinggiLimas) {
        this.alas = new JajarGenjang(alasJajarGenjang, tinggiAlas, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Limas = 1/3 * Luas Alas * Tinggi
        return (1.0 / 3.0) * this.alas.hitungLuas() * this.tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan = Luas Alas + Luas Seluruh Sisi Tegak
        double luasAlas = this.alas.hitungLuas();
        
        double sisiA = this.alas.getSisiA();
        double sisiB = this.alas.getSisiB();
        
        // Menghitung tinggi dari masing-masing segitiga di sisi tegak.
        // Ini adalah penyederhanaan yang mengasumsikan alasnya adalah persegi panjang.
        double tinggiSegitigaDiSisiA = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(sisiB / 2, 2));
        double tinggiSegitigaDiSisiB = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow(sisiA / 2, 2));

        // Menghitung luas dari 4 sisi tegak
        double luasSisiTegak = (sisiA * tinggiSegitigaDiSisiA) + (sisiB * tinggiSegitigaDiSisiB);

        return luasAlas + luasSisiTegak;
    }
}