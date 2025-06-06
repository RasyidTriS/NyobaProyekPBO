package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

public class CincinBola extends BentukTigaDimensi {
    private double jariJariBola;
    private double tinggiCincin;
    private final double PI = 3.14;

    public CincinBola(double jariJariBola, double tinggiCincin) {
        this.jariJariBola = jariJariBola;
        this.tinggiCincin = tinggiCincin;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Cincin/Cincin Bola = π * h^2 * (r - h/3)
        return this.PI * Math.pow(this.tinggiCincin, 2) * (this.jariJariBola - this.tinggiCincin / 3.0);
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Selimut Cincin Bola = 2 * π * r * h
        return 2 * this.PI * this.jariJariBola * this.tinggiCincin;
    }
    
    public double getJariJariBola() {
        return this.jariJariBola;
    }
    
    public double getTinggiCincin() {
        return this.tinggiCincin;
    }
}