package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Persegi;

// Kubus adalah BentukTigaDimensi, jadi kita implementasikan kontraknya
public class Kubus extends BentukTigaDimensi {

    // Kubus "memiliki" sisi persegi, jadi kita gunakan komposisi
    private Persegi sisi;

    public Kubus(double panjangSisi) {
        this.sisi = new Persegi(panjangSisi);
    }

    @Override
    public double hitungVolume() {
        // Volume = sisi * sisi * sisi atau Luas Alas * sisi
        return this.sisi.hitungLuas() * this.sisi.getSisi();
    }

    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan = 6 * Luas satu sisi
        return 6 * this.sisi.hitungLuas();
    }
    
    public double getPanjangSisi() {
        return this.sisi.getSisi();
    }
}