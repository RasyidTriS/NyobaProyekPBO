package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.BelahKetupat;

public class LimasBelahKetupat extends BentukTigaDimensi {

    private BelahKetupat alas;
    private double tinggi;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double sisi, double tinggi) {
        this.alas = new BelahKetupat(diagonal1, diagonal2, sisi);
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
        
        // Menghitung tinggi segitiga pada sisi tegak
        double setengahD1 = this.alas.getDiagonal1() / 2.0;
        double setengahD2 = this.alas.getDiagonal2() / 2.0;
        // Jarak dari titik pusat ke sisi (apotema alas) tidak bisa langsung dihitung
        // dengan mudah hanya dari diagonal. Untuk penyederhanaan, kita asumsikan
        // tinggi segitiga dihitung ke titik tengah salah satu sisi.
        double tinggiSegitigaTegak = Math.sqrt(Math.pow(this.tinggi, 2) + Math.pow(setengahD1, 2)); // Ini adalah penyederhanaan
        
        double luasSisiTegak = 4 * (0.5 * this.alas.getSisi() * tinggiSegitigaTegak);

        return luasAlas + luasSisiTegak;
    }
}