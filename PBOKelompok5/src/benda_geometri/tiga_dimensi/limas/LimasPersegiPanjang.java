package benda_geometri.tiga_dimensi.limas;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.PersegiPanjang;

public class LimasPersegiPanjang extends BentukTigaDimensi {

    private PersegiPanjang alas;
    private double tinggi;

    public LimasPersegiPanjang(double panjangAlas, double lebarAlas, double tinggi) {
        this.alas = new PersegiPanjang(panjangAlas, lebarAlas);
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
        
        double panjang = this.alas.getPanjang();
        double lebar = this.alas.getLebar();

        // Menghitung tinggi dari masing-masing segitiga di sisi tegak
        double tinggiSegitigaSisiPanjang = Math.sqrt(Math.pow(this.tinggi, 2) + Math.pow(lebar / 2, 2));
        double tinggiSegitigaSisiLebar = Math.sqrt(Math.pow(this.tinggi, 2) + Math.pow(panjang / 2, 2));
        
        // Luas 2 sisi tegak dengan alas 'panjang' + Luas 2 sisi tegak dengan alas 'lebar'
        double luasSisiTegak = (panjang * tinggiSegitigaSisiPanjang) + (lebar * tinggiSegitigaSisiLebar);
        
        return luasAlas + luasSisiTegak;
    }
}