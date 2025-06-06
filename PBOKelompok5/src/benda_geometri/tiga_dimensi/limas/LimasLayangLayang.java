package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.LayangLayang;

public class LimasLayangLayang extends BentukTigaDimensi {

    private LayangLayang alas;
    private double tinggi;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
        this.alas = new LayangLayang(diagonal1, diagonal2, sisiPendek, sisiPanjang);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Limas = 1/3 * Luas Alas * Tinggi
        return (1.0 / 3.0) * this.alas.hitungLuas() * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan = Luas Alas + Luas Seluruh Sisi Tegak
        double luasAlas = this.alas.hitungLuas();

        double sisiPendek = this.alas.getSisiPendek();
        double sisiPanjang = this.alas.getSisiPanjang();

        // Menghitung tinggi dari masing-masing segitiga di sisi tegak (dengan asumsi limas tegak)
        double tinggiSegitigaSisiPendek = Math.sqrt(Math.pow(this.tinggi, 2) + Math.pow(sisiPendek / 2, 2));
        double tinggiSegitigaSisiPanjang = Math.sqrt(Math.pow(this.tinggi, 2) + Math.pow(sisiPanjang / 2, 2));
        
        // Luas 2 sisi tegak dengan alas sisiPendek + Luas 2 sisi tegak dengan alas sisiPanjang
        double luasSisiTegak = (sisiPendek * tinggiSegitigaSisiPendek) + (sisiPanjang * tinggiSegitigaSisiPanjang);
        
        return luasAlas + luasSisiTegak;
    }
}