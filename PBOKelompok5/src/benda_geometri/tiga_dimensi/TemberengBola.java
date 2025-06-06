package benda_geometri.tiga_dimensi;

import benda_geometri.BentukTigaDimensi;

// TemberengBola adalah BentukTigaDimensi, jadi seharusnya extends BentukTigaDimensi
public class TemberengBola extends BentukTigaDimensi {
    private double jariJariBola;
    private double tinggiTembereng;
    private final double PI = 3.14;

    public TemberengBola(double jariJariBola, double tinggiTembereng) {
        this.jariJariBola = jariJariBola;
        this.tinggiTembereng = tinggiTembereng;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Tembereng Bola = (1/6) * pi * h * (3a^2 + h^2), dimana a adalah jari-jari alas tembereng
        // atau (1/3) * pi * h^2 * (3r - h)
        // Kode asli menggunakan rumus yang berbeda, kita akan sesuaikan agar mandiri
        double r = this.jariJariBola;
        double h = this.tinggiTembereng;
        // Rumus alternatif yang umum: (1.0 / 6.0) * PI * h * (3 * a^2 + h^2)
        // di mana a^2 = h * (2 * r - h).
        // Kita gunakan rumus yang lebih sederhana:
        return (1.0 / 3.0) * this.PI * Math.pow(h, 2) * (3 * r - h);
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan (selimut) Tembereng Bola = 2 * pi * r * h
        return 2 * this.PI * this.jariJariBola * this.tinggiTembereng;
    }

    public double getJariJariBola() {
        return this.jariJariBola;
    }
    
    public double getTinggiTembereng() {
        return this.tinggiTembereng;
    }
}