package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

// Kerucut adalah BentukTigaDimensi, jadi seharusnya extends BentukTigaDimensi
public class Kerucut extends BentukTigaDimensi {
    private double jariJari;
    private double tinggi;
    private final double PI = 3.14;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Kerucut = 1/3 * pi * r^2 * t
        return (1.0 / 3.0) * this.PI * Math.pow(this.jariJari, 2) * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Kerucut = pi * r * (r + s), dimana s adalah garis pelukis
        double s = Math.sqrt(Math.pow(this.jariJari, 2) + Math.pow(this.tinggi, 2));
        return this.PI * this.jariJari * (this.jariJari + s);
    }
    
    public double getJariJari() {
        return this.jariJari;
    }
    
    public double getTinggi() {
        return this.tinggi;
    }
}