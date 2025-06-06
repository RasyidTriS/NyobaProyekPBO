package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Trapesium;

public class LimasTrapesium extends BentukTigaDimensi {

    private Trapesium alas;
    private double tinggiLimas;

    public LimasTrapesium(double alasAtas, double alasBawah, double sisiMiring, double tinggiAlas, double tinggiLimas) {
        this.alas = new Trapesium(alasAtas, alasBawah, sisiMiring, tinggiAlas);
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
        // Perhitungan ini sangat kompleks dan membutuhkan banyak asumsi (misal: limas tegak).
        // Kita akan menyederhanakannya berdasarkan logika kode asli.
        double luasAlas = this.alas.hitungLuas();
        
        // Menghitung tinggi segitiga pada sisi tegak (apotema limas)
        double apotemaAlas = (this.alas.getAlasBawah() - this.alas.getAlasAtas()) / 2.0;
        double tinggiSisiTegakMiring = Math.sqrt(Math.pow(this.tinggiLimas, 2) + Math.pow(apotemaAlas, 2));

        // Menghitung luas 4 sisi tegak
        double luasSisiTegakAtas = 0.5 * this.alas.getAlasAtas() * tinggiSisiTegakMiring;
        double luasSisiTegakBawah = 0.5 * this.alas.getAlasBawah() * tinggiSisiTegakMiring;
        double luasSisiTegakSamping = 2 * (0.5 * this.alas.getSisiMiring() * tinggiSisiTegakMiring);

        return luasAlas + luasSisiTegakAtas + luasSisiTegakBawah + luasSisiTegakSamping;
    }
}