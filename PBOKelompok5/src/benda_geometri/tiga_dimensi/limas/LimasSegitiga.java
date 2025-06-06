package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Segitiga;

public class LimasSegitiga extends BentukTigaDimensi {
    
    private Segitiga alas;
    private double tinggiLimas;

    public LimasSegitiga(double alasSegitiga, double tinggiAlas, double tinggiLimas) {
        // Menggunakan komposisi: Limas "memiliki" alas berbentuk Segitiga
        this.alas = new Segitiga(alasSegitiga, tinggiAlas);
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Limas = 1/3 * Luas Alas * Tinggi
        return (1.0 / 3.0) * this.alas.hitungLuas() * this.tinggiLimas;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan = Luas Alas + Luas 3 Sisi Tegak.
        // Perhitungan ini mengasumsikan limas tegak dengan alas segitiga sama sisi
        // untuk menyederhanakan perhitungan luas sisi tegak.
        double luasAlas = this.alas.hitungLuas();
        
        double sisiAlas = this.alas.getSisi();

        // Menghitung tinggi dari segitiga sisi tegak (apotema limas)
        // Jarak dari pusat alas ke tengah sisi (apotema alas) untuk segitiga sama sisi
        double apotemaAlas = (sisiAlas * Math.sqrt(3)) / 6.0;
        double tinggiSegitigaTegak = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(apotemaAlas, 2));
        
        double luasSeluruhSisiTegak = 3 * (0.5 * sisiAlas * tinggiSegitigaTegak);

        return luasAlas + luasSeluruhSisiTegak;
    }
}