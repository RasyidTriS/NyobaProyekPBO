package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

public class KerucutTerpancung extends BentukTigaDimensi {
    private double jariJariAtas;
    private double jariJariBawah;
    private double tinggi;
    private final double PI = 3.14;

    public KerucutTerpancung(double jariJariBawah, double jariJariAtas, double tinggi) {
        this.jariJariBawah = jariJariBawah;
        this.jariJariAtas = jariJariAtas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Kerucut Terpancung
        return (1.0 / 3.0) * this.PI * this.tinggi * (Math.pow(this.jariJariBawah, 2) + 
                Math.pow(this.jariJariAtas, 2) + 
                (this.jariJariBawah * this.jariJariAtas));
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Kerucut Terpancung = Luas Alas Atas + Luas Alas Bawah + Luas Selimut
        double luasAlasAtas = this.PI * Math.pow(this.jariJariAtas, 2);
        double luasAlasBawah = this.PI * Math.pow(this.jariJariBawah, 2);
        
        double garisPelukis = Math.sqrt(Math.pow(this.jariJariBawah - this.jariJariAtas, 2) + Math.pow(this.tinggi, 2));
        double luasSelimut = this.PI * (this.jariJariAtas + this.jariJariBawah) * garisPelukis;
        
        return luasAlasAtas + luasAlasBawah + luasSelimut;
    }
}