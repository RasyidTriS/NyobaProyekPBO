package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

// Bola adalah BentukTigaDimensi, jadi seharusnya extends BentukTigaDimensi
public class Bola extends BentukTigaDimensi {
    private double jariJari;
    private final double PI = 3.14;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Bola = 4/3 * pi * r^3
        return (4.0 / 3.0) * this.PI * Math.pow(this.jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Bola = 4 * pi * r^2
        return 4 * this.PI * Math.pow(this.jariJari, 2);
    }
    
    public double getJariJari() {
        return this.jariJari;
    }
}