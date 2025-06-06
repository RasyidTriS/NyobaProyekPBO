package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

// Tabung adalah BentukTigaDimensi, jadi seharusnya extends BentukTigaDimensi
public class Tabung extends BentukTigaDimensi {
    private double jariJari;
    private double tinggi;
    private final double PI = 3.14;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Tabung = Luas Alas * Tinggi = (pi * r^2) * t
        return this.PI * Math.pow(this.jariJari, 2) * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Tabung = (2 * Luas Alas) + Luas Selimut
        // = (2 * pi * r^2) + (2 * pi * r * t)
        double luasAlas = this.PI * Math.pow(this.jariJari, 2);
        double luasSelimut = 2 * this.PI * this.jariJari * this.tinggi;
        return (2 * luasAlas) + luasSelimut;
    }
    
    public double getJariJari() {
        return this.jariJari;
    }

    public double getTinggi() {
        return this.tinggi;
    }
}