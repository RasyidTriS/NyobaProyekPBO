package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Persegi;

public class LimasPersegi extends BentukTigaDimensi {

    private Persegi alas;
    private double tinggi;

    public LimasPersegi(double sisiAlas, double tinggi) {
        this.alas = new Persegi(sisiAlas);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Limas = 1/3 * Luas Alas * Tinggi
        return (1.0 / 3.0) * this.alas.hitungLuas() * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan = Luas Alas + (4 * Luas Segitiga Sisi Tegak)
        double luasAlas = this.alas.hitungLuas();
        
        // Menghitung tinggi segitiga pada sisi tegak (apotema limas)
        double sisiAlas = this.alas.getSisi();
        double tinggiSegitigaTegak = Math.sqrt(Math.pow(sisiAlas / 2, 2) + Math.pow(this.tinggi, 2));
        
        double luasSisiTegak = 4 * (0.5 * sisiAlas * tinggiSegitigaTegak);

        return luasAlas + luasSisiTegak;
    }
}