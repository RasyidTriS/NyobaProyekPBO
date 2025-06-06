package benda_geometri.tiga_dimensi.prisma;

import benda_geometri.BentukTigaDimensi;
import benda_geometri.dua_dimensi.Persegi;

public class PrismaPersegi extends BentukTigaDimensi {

    private Persegi alas;
    private double tinggi;

    public PrismaPersegi(double sisiAlas, double tinggi) {
        this.alas = new Persegi(sisiAlas);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        // Rumus Volume Prisma = Luas Alas * Tinggi
        return this.alas.hitungLuas() * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus Luas Permukaan Prisma = (2 * Luas Alas) + (Keliling Alas * Tinggi)
        double luasAlas = this.alas.hitungLuas();
        double kelilingAlas = this.alas.hitungKeliling();
        return (2 * luasAlas) + (kelilingAlas * this.tinggi);
    }
}